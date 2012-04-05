import groovy.xml.MarkupBuilder

def todos = [
	[name:'���Ђ̌��e������',due:'3/22',priority:1],
	[name:'�v���[���e�[�V�����̌��e',due:'4/11',priority:2]
]

def builder = new MarkupBuilder()

builder.html{
	head{
		title('ToDo���X�g')
	}
	body{
		table(border:'1'){
			tr{
				th('����')
				th('����')
				th('�D��x')
			}
		todos.each{ todo ->
			tr{
				td(todo['name'])
				td(todo['due'])
				td(align:'center',todo['priority'])
			}
		}
	}
}
}

//MarkupBuilder�̎g�p��
