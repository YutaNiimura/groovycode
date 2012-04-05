@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


MyClass.metaClass{
	methodA{args -> println "methodA($args)"}
	methodB << {args -> println "methodB($args)"}
	method0 << {String s -> println "method0(String $s)"}
	'static'{
		methodS{args -> println "methodS($args)"}
	}
	'<init>'{String arg -> println "MyClass($arg)"}
	property = 'example'
}

//メタクラスの実装（ExpandoMetaClass使用）