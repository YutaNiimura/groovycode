assert [1,*[2,3]] == [1,2,3]
a = [5,6]
assert [4,*a] == [4,5,6]

def foo(a,b){return a+b}
assert foo(*a) == foo(5,6)

//リスト展開演算子の使用例