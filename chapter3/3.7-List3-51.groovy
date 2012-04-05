assert [1,2,3].reverse() == [3,2,1]	//リスト反転
List list = [1,2]
list.push(3)				//末尾に追加
assert list == [1,2,3]
assert list.pop() == 3			//末尾取り出し
assert list.pop() == 2
assert list.pop() == 1
try{
	list.pop()
	assert false
}
catch(NoSuchException){
	assert true
}
list = [1,2,3]
assert list.first() == 1		//最初の要素
assert list.tail() == [2,3]		//最初以外の要素
assert [[1,2,3],[4,5,6]].transpose() == [[1,4],[2,5],[3,6]]	//転置
assert [1,2].subsequences() == [1],[2],[1,2] as Set		//部分シーケンス
assert [1,2,3].permutations() == [[1,2,3],[2,3,1],[3,2,1],[3,1,2],[2,1,3],[1,3,2]]	//順列