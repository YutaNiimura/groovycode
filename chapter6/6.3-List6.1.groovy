import groovyx.gpars.GParsPool
import java.util.concurrent.atomic.AtomicInteger

GParsPool.withPool{
	def result = new AtomicInteger(0)
	(1..100).eachParallel{result.addAndGet(it)}
	assert result.get() == 5050
}

GParsPool.withPool(10){
	assert (1..10).findAllParallel{it%2 == 0} == [2,4,6,8,10]
}

GParsPool.withPool{
	assert (1..10).parallel.filter{it % 2 == 0}.map{it}.collection == [2,4,6,8,10]
	assert (1..10).parallel.filter{it % 2 == 0}.map{it}.sum() == 30
}
//並行コレクション処理