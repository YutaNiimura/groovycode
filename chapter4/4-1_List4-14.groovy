import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.FlowLayout as FL
import javax.swing.WindowConstants as WC
import javax.swing.BoxLayout as BOX

data = [
	[id:1,item:'書類の原稿を書く',	prio:1,due:'3/31'],
	[id:2,item:'クリーニングを出す',	prio:3,due:'3/24'],
	[id:3,item:'プレゼンテーションの準備',	prio:2,due:'4/15']
]

swing = new SwingBuilder()

table = swing.table(){
	tableModel(list:data){
		propertyColumn(header:'ID',propertyName:'id',preferredWidth:20)
		propertyColumn(header:'項目',propertyName:'item',preferredWidth:150)
		propertyColumn(header:'優先度',propertyName:'prio',preferredWidth:20)
		propertyColumn(header:'期限',propertyName:'due',preferredWidth:20)
	}
}

frame = swing.frame(title:'TODOリスト',
	layout: new BL(),
	defaultCloseOperation:WC.EXIT_ON_CLOSE){
		panel(constraints:BL.NORTH){
			button(text:'レコード追加',actionPerformed:{event ->
			dialog.show()
			})
		}
		panel(constraints:BL.CENTER){
			scrollPane{
				widget(table)
			}
		}
	}

dialog = swing.dialog(size:[350,250],layout:new FL()){
	panel{label 'ID';textField(id:'id',columns:20)}
	panel{label '項目';textField(id:'item',columns:20)}
	panel{label '優先度';comboBox(id:'prio',items:[1,2,3])}
	panel{label '期限';textField(id:'due',columns:20)}
	panel{
		button(text:'登録',actionPerformed:{event ->
			data << [
				'id':swing.id.text,
				'item':swing.item.text,
				'prio':swing.prio.selectedItem,
				'due':swing.due.text]
			table.model.fireTableDataChanged()
			dialog.hide()
		})
		button(text:'閉じる',actionPerformed:{event ->
			dialog.hide()})
	}
}

frame.pack()
frame.show()

//SwingBuilderの使用例(アクション追加)