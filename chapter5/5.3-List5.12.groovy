@Singleton
class Foo{
	def hello(){"hello"}
}

assert Foo.instance.hello() == "hello"

def a = new Foo()	//RuntimeException��

//@Singleton�A�m�e�[�V�����i�V���O���g���p�^�[���̎����j