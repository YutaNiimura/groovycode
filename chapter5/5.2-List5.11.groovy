class HookTest{
	Object property
	void method(Object args){println "method($args)"}

	Object invokeMethod(String name,Object args){
		println "invokeMethod($name,$args)"
	}
	Object getProperty(String name){
		println "getProperty($name)"
	}
	void setProperty(String name,Object value){
		println "setProperty($name,$value)"
	}
}

obj = new HookTest(property:"init")

obj.method("abc")	//����

obj.xyz(123)	//���݂��Ȃ�

obj.property	//����
obj.property = "changed"

obj.foo		//���݂��Ȃ�
obj.foo = "bar"


//�t�b�N���\�b�h�̎g�p��