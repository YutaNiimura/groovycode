@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj = new Expando()

obj.name = 'Duke'	//name�v���p�e�B��`

obj.great = {to -> println "Hi,$to. I'm $name!"}	//great���\�b�h��`

obj.great('Steve')

//Expando�̎g�p��