import groovy.xml.XmlUtil
import groovy.xml.dom.DOMCategory
import groovy.xml.DOMBuilder

def doc = DOMBuilder.parse(
	new InputStreamReader(new FileInputStream('sample2.xml'),'UTF-8'))

def root = doc.documentElement

use(DOMCategory){
	def groceries = root.category.findAll{it.'@type' == 'groceries'}[0].item
	groceries.each{ g ->
		g.value = 'luxury ' +g.text()
	}

	def supplies = root.category.findAll{it.'@type' == 'supplies'}[0].item
	supplies.findAll{it.text() == 'pen'}.each{ s->
		s['@quantity'] = s.'@quantity'.toInteger() + 2
		s['@when'] = 'Urgent'
	}

	def presents = root.category.find{it.'@type' == 'present'}
	presents.item.each{
		presents.removeChild(it)
		}
	presents.appendNode('item',"mother's birthday")
	presents.appendNode('item',[when:'Oct 15'],"Monica's birthday")
}

def out = new FileOutputStream('domcategory.output.xml')
XmlUtil.serialize(root,out)

//DOM‚É‚æ‚éŠg’£
