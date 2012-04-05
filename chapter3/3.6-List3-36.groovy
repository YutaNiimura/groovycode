Closure clos1 = { println "Hello closure!"}
assert clos1 instanceof groovy.lang.Closure

clos1.call()
clos1()
//クロージャの呼び出し