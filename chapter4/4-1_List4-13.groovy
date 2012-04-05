import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import javax.swing.WindowConstants as WC

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
			label(text:'�����܂łɂ�邱��!!')
		}
		panel(constraints:BL.CENTER){
			scrollPane{
				widget(table)
			}
		}
	}


frame.pack()
frame.show()

//SwingBuilder�̎g�p��