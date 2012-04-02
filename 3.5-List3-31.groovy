assert (/\n/.size() == 2)
assert ("\n".size() == 1)

println "abc\ndef\n"

println (/abc\ndef\n/)