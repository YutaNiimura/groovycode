@Immutable
class Foo{
	int x
	Date date = new Date(1000)
}

a = new Foo(x:1)
assert a.x == 1

assert a.date.getTime() == 1000
a.date.setTime(2000)
assert a.date.getTime() == 1000	//�ύX����Ȃ�

a.x = 3	//�s�\

//@Immutable�A�m�e�[�V�����̗�i�N���X��ύX�s�Ɂj