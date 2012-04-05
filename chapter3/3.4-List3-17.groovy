class MyClass{
	public a = 1
}

c = new MyClass()
assert c.a == 1
assert c.'a' == 1
assert c."a" == 1

def fieldName = 'a'
assert c."$fieldName" == 1

assert c['a'] == 1
assert c[fieldName] == 1
assert c.getProperty(fieldName) == 1