def a = "ABC"

assert "Hi ${a*2}" == "Hi ABCABC"
assert "Hi ${a}" == "Hi ABC"
assert "Hi $a" == "Hi ABC"