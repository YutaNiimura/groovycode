@Immutable
class Foo{
	int x
	Date date = new Date(1000)
}

a = new Foo(x:1)
assert a.x == 1

assert a.date.getTime() == 1000
a.date.setTime(2000)
assert a.date.getTime() == 1000	//変更されない

a.x = 3	//不可能

//@Immutableアノテーションの例（クラスを変更不可に）