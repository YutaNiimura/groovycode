class LazyTest{
	def initialValue(s){
		println "Called with $s"
		return s.toUpperCase()
	}

	def normalField = initialValue("normal")
	@Lazy lazyField = initialValue("lazy")
}

def t = new LazyTest()
assert t.normalField == "NORMAL"
Thread.sleep(3000)
assert t.lazyField == "LAZY"

//@Lazyアノテーションの使用例（初回参照時に初期化されるフィールドを定義）