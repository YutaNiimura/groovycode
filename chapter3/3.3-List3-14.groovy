class MyClass{
	def name
	String getName(){"["+name+"]"}
	void setName(String s){name=s}
}

MyClass c = new MyClass()
c.name="�R�c���Y"
assert c.name == "[�R�c���Y]"
