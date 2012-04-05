assert true == Character.isDigit("3" as char)	//文字列をchar型に
double[] d = [3.0,4.0,5.0] as double[]		//リストを配列に
assert d instanceof double[]

int [][] i = [[1,2],[3,4],[5,6]] as int [][]	//リストのリストを配列の配列に
assert i instanceof int [][]

TreeMap tmap = [a:1,b:2,c:3] as TreeMap		//マップをTreeMapに
assert tmap instanceof TreeMap
Set set1 = [1,2,2,3] as Set			//リストを集合に
Set set2 = [4,3,2] as Set
assert set1 + set2 == [1,2,3,4] as Set		//a∪b

//as演算子の使用例