class Complex{
	double re
	double im
	boolean asBoolean(){
		!(re==0 && im == 0)
	}
}
assert !new Complex(im:0,re:0)
assert new Complex(im:0,re:1)
assert new Complex(im:1,re:0)
assert new Complex(im:1,re:1)