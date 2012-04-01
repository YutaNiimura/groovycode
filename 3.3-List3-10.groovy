class MyClass{
	static foo(){
		assert this == MyClass
		assert this.class == java.lang.Class
	}
}
MyClass.foo()