@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


MyClass.metaClass.methodA = {args -> println "methodA($args)"}	//メソッド定義（同名上書き）

MyClass.metaClass.methodB << {args -> println "methodB($args)"}	//メソッド定義（同名例外発生）

MyClass.metaClass.method0 << {String s -> println "method0(String $s)"}\
				<< {Integer i -> println "method0(int $i)"}	//特定のメソッドをオーバーライド

MyClass.metaClass.static.methodS = {args -> println "methodS($args)"}	//staticメソッドの定義

MyClass.metaClass.constructor = {String arg -> println "MyClass($arg)"}	//コンストラクタの定義

MyClass.metaClass.property = 'example'	//プロパティの定義

//メタクラスの実装（Expando非使用）

