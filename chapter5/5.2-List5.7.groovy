@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj.getMetaClass()
obj.metaClass
obj.class.metaClass
String.metaClass

//ƒƒ^ƒNƒ‰ƒX‚Ìæ“¾—á