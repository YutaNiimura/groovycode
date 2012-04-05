@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj = new Expando()

obj.name = 'Duke'	//nameプロパティ定義

obj.great = {to -> println "Hi,$to. I'm $name!"}	//greatメソッド定義

obj.great('Steve')

//Expandoの使用例