class StringCategory{
	static String camelize(String self){
		self.toLowerCase().replaceAll(/_./){it[1].toUpperCase()}
	}
}

use(StringCategory){
	assert 'ENV_GROOVY_HOME'.camelize() == 'envGroovyHome'
}

//use���g�����J�e�S���̓K�p