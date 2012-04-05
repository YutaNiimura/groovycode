import groovy.xml.StreamingMarkupBuilder

def xml = new StreamingMarkupBuilder()

def writable = xml.bind{
	Produces{
		Product(type:'regular'){
			Name('Instant Noodle')
			Price(147)
}}}

println writable.toString()

//StreamingMarkupBuilder