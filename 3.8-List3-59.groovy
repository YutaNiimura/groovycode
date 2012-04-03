String s = null
try{
	assert s?.toUpperCase() == null
}
catch(NullPointerException e){
	assert false
}

//nullセーフナビゲーションの使用例