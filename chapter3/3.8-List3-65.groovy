assert true == Character.isDigit("3" as char)	//�������char�^��
double[] d = [3.0,4.0,5.0] as double[]		//���X�g��z���
assert d instanceof double[]

int [][] i = [[1,2],[3,4],[5,6]] as int [][]	//���X�g�̃��X�g��z��̔z���
assert i instanceof int [][]

TreeMap tmap = [a:1,b:2,c:3] as TreeMap		//�}�b�v��TreeMap��
assert tmap instanceof TreeMap
Set set1 = [1,2,2,3] as Set			//���X�g���W����
Set set2 = [4,3,2] as Set
assert set1 + set2 == [1,2,3,4] as Set		//a��b

//as���Z�q�̎g�p��