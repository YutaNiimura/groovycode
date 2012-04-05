assert 1
assert !0
assert "0"
assert 0.001
assert !0.0
assert [1]
assert ![]
assert [key:'value']
assert ![:]
assert "abcdefg" =~ /c.*f/
assert !("abcdefg" =~ /x.*z/)

Iterator iter = [1,2,3,4,5].iterator()
while(iter.hasNext()){
	def n = iter.next()
	if(n!=5){
		assert iter
	}
	else{
		assert !iter
	}
}