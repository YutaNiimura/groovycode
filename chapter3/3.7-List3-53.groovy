assert [1,2,3].collect{it*2} == [2,4,6]
assert [[1,2],["a","b"]].combinations() ==
	[[1,"a"],[2,"a"],[1,"b"],[2,"b"]]	//組み合わせ
assert ['a','a','A','b'].count('a') == 2	//出現回数
assert (1..10).find{ it%2 == 0} == 2	//クロージャが真になる最初の要素
assert (1..10).findAll{it % 2 == 0} == [2,4,6,8,10]	//クロージャが真になる全ての要素
List result = []
[1,2,3].eachPermutation{ result << it } 	//全ての順列
assert result == [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
assert [1,2,3,4].intersect([3,4,5]) == [3,4]	//共通部分
List a = [1,2,3]
a << 4	//要素追加
assert a == [1,2,3,4]	
assert [1,2,3].join("-") == '1-2-3'	//区切り文字を挟んで結合
assert [1,3,2,1].max() == 3		//最大値
assert [1,3,2,1].min() == 1		//最小値
assert [1,3,2,1].sort() == [1,1,2,3]	//ソート
assert [1,3,2,1].sum() == 7		//合計
assert [1,3,2,1].unique() == [1,3,2]	//重複の削除

//コレクションのためのGDKメソッド例