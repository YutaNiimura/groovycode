@Category(String)
class StringCategory{
	String camelize(){
		this.toLowerCase().replaceAll(/_./){it[1].toUpperCase()}
	}
}

//カテゴリクラスの定義(@Categoryを使用)