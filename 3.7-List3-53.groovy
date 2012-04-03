assert [1,2,3].collect{it*2} == [2,4,6]
assert [[1,2],["a","b"]].combinations() ==
	[[1,"a"],[2,"a"],[1,"b"],[2,"b"]]	//�g�ݍ��킹
assert ['a','a','A','b'].count('a') == 2	//�o����
assert (1..10).find{ it%2 == 0} == 2	//�N���[�W�����^�ɂȂ�ŏ��̗v�f
assert (1..10).findAll{it % 2 == 0} == [2,4,6,8,10]	//�N���[�W�����^�ɂȂ�S�Ă̗v�f
List result = []
[1,2,3].eachPermutation{ result << it } 	//�S�Ă̏���
assert result == [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
assert [1,2,3,4].intersect([3,4,5]) == [3,4]	//���ʕ���
List a = [1,2,3]
a << 4	//�v�f�ǉ�
assert a == [1,2,3,4]	
assert [1,2,3].join("-") == '1-2-3'	//��؂蕶��������Ō���
assert [1,3,2,1].max() == 3		//�ő�l
assert [1,3,2,1].min() == 1		//�ŏ��l
assert [1,3,2,1].sort() == [1,1,2,3]	//�\�[�g
assert [1,3,2,1].sum() == 7		//���v
assert [1,3,2,1].unique() == [1,3,2]	//�d���̍폜

//�R���N�V�����̂��߂�GDK���\�b�h��