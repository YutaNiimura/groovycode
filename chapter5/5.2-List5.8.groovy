@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj.metaClass.methods.each{println it}	//メソッド一覧

obj.metaClass.properties.each{println it.name}	//プロパティ一覧

//メタ情報の取得例