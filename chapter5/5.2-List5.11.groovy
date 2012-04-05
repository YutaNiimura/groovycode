class HookTest{
	Object property
	void method(Object args){println "method($args)"}

	Object invokeMethod(String name,Object args){
		println "invokeMethod($name,$args)"
	}
	Object getProperty(String name){
		println "getProperty($name)"
	}
	void setProperty(String name,Object value){
		println "setProperty($name,$value)"
	}
}

obj = new HookTest(property:"init")

obj.method("abc")	//存在

obj.xyz(123)	//存在しない

obj.property	//存在
obj.property = "changed"

obj.foo		//存在しない
obj.foo = "bar"


//フックメソッドの使用例