assert "abc" ==~ /a.c/
assert !("123abcdef" ==~ /a.c/)

//正規表現マッチ演算子（==~:全体がマッチするか）