def x = "123.45"
assert x.isInteger() == false
assert x.isDouble() == true
assert x.isNumber() == true

//数値への変換可能性チェック