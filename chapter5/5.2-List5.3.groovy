class StringCategory{
	static String camelize(String self){
		self.toLowerCase().replaceAll(/_./){it[1].toUpperCase()}
	}
}

//カテゴリクラスの定義