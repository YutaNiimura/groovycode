FileInputStream fis = null;
try{
	fis new FileInputStream("input.txt");
}

finally{
	if(fis != null){
		try{fis.close();}catch(Exception e){}
	}
}

//�t�@�C���ɑ΂��鏈���iJava�̏ꍇ�j