def expected = [['a','bb','ccc'],
		['aaa','bb','c']]

def target = "a bb ccc aaa bb c"

i=0

(target =~ /(a+) (b) (c+)/).each{g0,g1,g2,g3 ->
	assert [g1,g2,g3] == expected[i++]
}

i=0
target.eachMatch(/(a+) (b+) (c+)/){g0,g1,g2,g3 ->
	assert [g1,g2,g3] == expected[i++]
}

//³‹K•\Œ»‚ÌŒã•ûQÆ—á