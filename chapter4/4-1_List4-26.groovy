import groovy.xml.StreamingMarkupBuilder

def root = new XmlSlurper().parse('sample2.xml')

def out = new OutputStreamWriter(
	new FileOutputStream("xmlslurper.output.xml"),"UTF-8")

def outputBuilder = new StreamingMarkupBuilder()
def writer = outputBuilder.bind{
	mkp.xmlDeclaration()
	mkp.yield(root)
}

out << writer

//‚»‚Ì‚Ü‚ÜXML‚Æ‚µ‚Äo—Í