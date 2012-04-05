import java.util.regex.Pattern
Pattern pat = ~/G....y/
pat.compile()	//マッチング前にコンパイル
assert "Groovy" =~ pat

//パターンオブジェクト生成演算子の使用例