@Category(String)
class StringCategory{
	String camelize(){
		this.toLowerCase().replaceAll(/_./){it[1].toUpperCase()}
	}
}

//�J�e�S���N���X�̒�`(@Category���g�p)