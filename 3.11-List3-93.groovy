String data ="�����X�J�C�c���[��634m�A�����^���[��333m"
result = data.replaceAll(/(\d+)m/){g0,g1 ->
	(g1 as double) * 3.281 + "�t�B�[�g"
}

assert result =="�����X�J�C�c���[��2080.154�t�B�[�g�A�����^���[��1092.573�t�B�[�g"

//�N���[�W���������ɂƂ�replaceAll���\�b�h�̎g�p��