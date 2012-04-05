@Category(Object)
class DebugUtil{
	void debug(info){/*debug method*/}
}

@Mixin(DebugUtil)
class MyClass{/*class*/}

obj = new MyClass()
obj.debug("testing...")


MyClass.metaClass.methodA = {args -> println "methodA($args)"}	//���\�b�h��`�i�����㏑���j

MyClass.metaClass.methodB << {args -> println "methodB($args)"}	//���\�b�h��`�i������O�����j

MyClass.metaClass.method0 << {String s -> println "method0(String $s)"}\
				<< {Integer i -> println "method0(int $i)"}	//����̃��\�b�h���I�[�o�[���C�h

MyClass.metaClass.static.methodS = {args -> println "methodS($args)"}	//static���\�b�h�̒�`

MyClass.metaClass.constructor = {String arg -> println "MyClass($arg)"}	//�R���X�g���N�^�̒�`

MyClass.metaClass.property = 'example'	//�v���p�e�B�̒�`

//���^�N���X�̎����iExpando��g�p�j

