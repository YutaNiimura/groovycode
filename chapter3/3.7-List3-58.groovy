def map = [:].withDefault{0}
new File(args[0]).eachLine{
	it.split(/\s+/).each{
		map[it]++
	}
}
map.entrySet().sort{it.value}.each{
	println "${it.value}:[${it.key}]"
}
//wordCountägí£î≈