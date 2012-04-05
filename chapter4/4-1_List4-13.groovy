import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import javax.swing.WindowConstants as WC

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
			label(text:'期限までにやること!!')
		}
		panel(constraints:BL.CENTER){
			scrollPane{
				widget(table)
			}
		}
	}


frame.pack()
frame.show()

//SwingBuilderの使用例