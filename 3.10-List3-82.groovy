try{
	throw new IllegalArgumentException()
}
catch(e){
	assert e instanceof java.lang.IllegalArgumentException
}

//例外クラス指定の省略