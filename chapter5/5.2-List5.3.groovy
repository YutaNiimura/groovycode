class StringCategory{
	static String camelize(String self){
		self.toLowerCase().replaceAll(/_./){it[1].toUpperCase()}
	}
}

//�J�e�S���N���X�̒�`