class MyClass { boolean isCase(n){return n == 999}}
a = new MyClass()

switch(x){
	case "abc":
		break

	case ~/a(.*)c/:
		assert java.util.regax.Matcher.lastMatcher[0][0] == "abbc"
		assert java.util.regax.Matcher.lastMatcher[0][1] == "bb"
		break

	case 1..3:
		break

	case [1,3,5]:
		break

	case String:
		break

	case a:
		break

	case {it % 2 == 0}:
		break
}

//switch~case•¶‚Ì—á