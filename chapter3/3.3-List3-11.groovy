def hello(String s){
	println "hello(String)-> $s"
}
def hello(Integer i){
	println "hello(Integer)-> $i"
}
Object x=3
Object y="ABC"
hello(x)
hello(y)