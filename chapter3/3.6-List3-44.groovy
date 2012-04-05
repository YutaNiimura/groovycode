FileInputStream fis = null;
try{
	fis new FileInputStream("input.txt");
}

finally{
	if(fis != null){
		try{fis.close();}catch(Exception e){}
	}
}

//ファイルに対する処理（Javaの場合）