@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj.metaClass.respondsTo(obj,'close')	//closeメソッドが呼び出せるか確認

obj.metaClass.hasProperty(obj,'name')	//nameプロパティを持っているか確認

//メソッドやプロパティの利用可能確認