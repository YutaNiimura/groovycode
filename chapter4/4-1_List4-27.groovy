import groovy.xml.StreamingMarkupBuilder

def root = new XmlSlurper().parse('sample2.xml')


def groceries = root.category.findAll{it.@type == 'groceries'}
def g = groceries[0]

g.item.eachWithIndex {item,i->
	g.item[i] = 'luxury '+ item
}


def out = new OutputStreamWriter(
	new FileOutputStream("xmlslurper.output.xml"),"UTF-8")

def outputBuilder = new StreamingMarkupBuilder()
def writer = outputBuilder.bind{
	mkp.xmlDeclaration()
	mkp.yield(root)
}

out << writer

//テキストノードの変更