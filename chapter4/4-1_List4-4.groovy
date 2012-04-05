import groovy.xml.MarkupBuilder

def xml = new MarkupBuilder()

xml.Products(null,
	{
		Product(type:'regular',
			{
				Name('Instant Noodle')
				Pric(147)
			}
		)
	}
)

//List4-3‚ð‚í‚©‚è‚â‚·‚­‚µ‚½‚à‚Ì
