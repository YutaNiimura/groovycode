assert [1,2,3].reverse() == [3,2,1]	//���X�g���]
List list = [1,2]
list.push(3)				//�����ɒǉ�
assert list == [1,2,3]
assert list.pop() == 3			//�������o��
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
assert list.first() == 1		//�ŏ��̗v�f
assert list.tail() == [2,3]		//�ŏ��ȊO�̗v�f
assert [[1,2,3],[4,5,6]].transpose() == [[1,4],[2,5],[3,6]]	//�]�u
assert [1,2].subsequences() == [1],[2],[1,2] as Set		//�����V�[�P���X
assert [1,2,3].permutations() == [[1,2,3],[2,3,1],[3,2,1],[3,1,2],[2,1,3],[1,3,2]]	//����