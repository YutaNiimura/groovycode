def my_if(Boolean expr,Closure clos){
	if(expr){
		clos.call(expr)
	}
}

Closure clos = { println "expr=$it"}
my_if(true,clos)

my_if(true,{println "expr=$it"})

my_if(true){
	println "expr=$it"
}

//クロージャを引数としてメソッドに渡す例