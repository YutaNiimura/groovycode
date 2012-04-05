new File('text.txt').eachLine('UTF-8'){
	println "Line: $it"
}

//任意の文字エンコーディングの指定