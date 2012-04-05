class MyClass{
	def name
	String getName(){"["+name+"]"}
	void setName(String s){name=s}
}

MyClass c = new MyClass()
c.name="山田太郎"
assert c.name == "[山田太郎]"
