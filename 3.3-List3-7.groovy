def foo(Map param){
	assert param.name == "���Y"
	assert param.age == 25
	assert param.gender == null
}
foo(age:25,name:"���Y")