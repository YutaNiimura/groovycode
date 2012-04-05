@Singleton
class Foo{
	def hello(){"hello"}
}

assert Foo.instance.hello() == "hello"

def a = new Foo()	//RuntimeExceptionに

//@Singletonアノテーション（シングルトンパターンの実現）