@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj.metaClass.respondsTo(obj,'close')	//close���\�b�h���Ăяo���邩�m�F

obj.metaClass.hasProperty(obj,'name')	//name�v���p�e�B�������Ă��邩�m�F

//���\�b�h��v���p�e�B�̗��p�\�m�F