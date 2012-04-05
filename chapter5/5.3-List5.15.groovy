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

//@Lazy�A�m�e�[�V�����̎g�p��i����Q�Ǝ��ɏ����������t�B�[���h���`�j