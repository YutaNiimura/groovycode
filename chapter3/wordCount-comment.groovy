//�w�肵���e�L�X�g�t�@�C�����̒P��̏o���񐔂��ꗗ�\������					//�R�����g�s
	def map = [:]											//�ϐ�map���`�B�����l�Ƃ��ċ�̃}�b�v��^����
															//def�͌^���w�肵�Ȃ�����
															//�}�b�v�̃��e����:�u�L�[:�l�v�iHashMap�I�j
	
	new File(args[0]).eachLine{								//args:�R�}���h���C������
															//File():java.io.File�N���X�̃C���X�^���X����
															//import�͕K�v�Ȃ�
															//eachLine:�e�s�ɑ΂��ď������s���Ƃ������\�b�h
															//{�`}�̓N���[�W���B�u���b�N���ł͂Ȃ��B�����̂܂Ƃ܂�B
		
		/*File().eachLine{}:�t�@�C�����I�[�v�����A���̃t�@�C���̊e�s�ɑ΂��ăN���[�W���Ŏw�肵���������s���A�t�@�C�����N���[�Y����*/
		/*try catch�͕s�v�B�e�s�̓��e��it�Ƃ����Öق̕ϐ��ň����*/
		
		it.split(/\s+/).each {								//'/\s+/':\s+�̈Ӗ��i�󔒕����̂P��ȏ�̌J��Ԃ�
															//�e�s���󔒂ŕ������Ă���ɂ��ꂼ��̒P�������
															//�����ł�it�͂�������it�Ƃ͈Ⴄ
			map[it] = (map[it]==null) ? 1 : (map[it]+1)		
			
			/*���߂ďo�������P��̏ꍇ�imap[it]==null�j�A�}�b�v���ɃG���g�������݂��Ȃ����߂P�������l�Ƃ���B
			 * �Q��ڈȍ~�o�������P��̏ꍇ�A�}�b�v�̃G���g���ɂP�����Z����
			 */
		}
	}
	map.entrySet().sort{it.value}.each {					//map�̃G���g���[�Z�b�g�����o���A����value�Ń\�[�g
															//���ꂼ�������
		/*entrySet��java��HashMap��entrySet���Ăяo���Ă���B������̂�Set�^�̃I�u�W�F�N�g
		 * sort��Groovy�̃��\�b�h�B�N���[�W���̈��������ɂ��ă\�[�g
		 */
		println "${it.value} : [${it.key}]"					//���ꂼ��̒l�ƃL�[���o��(println�B�J�b�R�ȗ�)
															//${}�ň͂܂ꂽ���͂��̎��̒l�����s���ɕ]�������
			}

	//�|�C���g1.�N���X�⃁�\�b�h�̒�`������K�v���Ȃ��B���s�̓X�N���v�g�̐擪����s����
	
		
