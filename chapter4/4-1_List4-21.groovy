def root = new XmlParser().parse('sample2.xml')

def groceries = root.category.findAll{it.@type == 'groceries'}
groceries[0].item.each{g->
	g.value='luxury '+g.text()
}


new File("xmlparser.output.xml").withPrintWriter("UTF-8"){writer ->
	writer << '<?xml version ="1.0" encoding="UTF-8"?>' << "\n"
	def printer = new XmlNodePrinter(writer)
	printer.preserveWhitespace = true
	printer.print(root)
}

//テキストノード変更