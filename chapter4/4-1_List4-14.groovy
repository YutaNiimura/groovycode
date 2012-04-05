import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.FlowLayout as FL
import javax.swing.WindowConstants as WC
import javax.swing.BoxLayout as BOX

data = [
	[id:1,item:'���ނ̌��e������',	prio:1,due:'3/31'],
	[id:2,item:'�N���[�j���O���o��',	prio:3,due:'3/24'],
	[id:3,item:'�v���[���e�[�V�����̏���',	prio:2,due:'4/15']
]

swing = new SwingBuilder()

table = swing.table(){
	tableModel(list:data){
		propertyColumn(header:'ID',propertyName:'id',preferredWidth:20)
		propertyColumn(header:'����',propertyName:'item',preferredWidth:150)
		propertyColumn(header:'�D��x',propertyName:'prio',preferredWidth:20)
		propertyColumn(header:'����',propertyName:'due',preferredWidth:20)
	}
}

frame = swing.frame(title:'TODO���X�g',
	layout: new BL(),
	defaultCloseOperation:WC.EXIT_ON_CLOSE){
		panel(constraints:BL.NORTH){
			button(text:'���R�[�h�ǉ�',actionPerformed:{event ->
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
	panel{label '����';textField(id:'item',columns:20)}
	panel{label '�D��x';comboBox(id:'prio',items:[1,2,3])}
	panel{label '����';textField(id:'due',columns:20)}
	panel{
		button(text:'�o�^',actionPerformed:{event ->
			data << [
				'id':swing.id.text,
				'item':swing.item.text,
				'prio':swing.prio.selectedItem,
				'due':swing.due.text]
			table.model.fireTableDataChanged()
			dialog.hide()
		})
		button(text:'����',actionPerformed:{event ->
			dialog.hide()})
	}
}

frame.pack()
frame.show()

//SwingBuilder�̎g�p��(�A�N�V�����ǉ�)