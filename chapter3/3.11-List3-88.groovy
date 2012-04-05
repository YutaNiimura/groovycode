def m = ("abcabc" =~ /a.c/)
assert m

if("abcabc" =~ /a.c/){
	assert true
}

else {assert false}

//Matcherオブジェクトの評価