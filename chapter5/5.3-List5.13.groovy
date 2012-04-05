class Foo{
	static Foo instance = new Foo()
	private Foo(){
		if(instance != null){
			throw new RuntimeException("Can't instantiate singleton Foo. Use Foo.instance")
		}
	}
	def hello(){"hello"}
}
assert Foo.instance.hello() == "hello"

//@Singleton�������Ƃ��̂悤�ȋL�q������K�v������