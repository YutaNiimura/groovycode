@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


obj.metaClass.methods.each{println it}	//���\�b�h�ꗗ

obj.metaClass.properties.each{println it.name}	//�v���p�e�B�ꗗ

//���^���̎擾��