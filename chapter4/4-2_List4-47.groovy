def file = new File('dummy.txt')
file.delete()
file <<'aaa\n'<<'bbb\n'
assert file.text == 'aaa\nbbb\n'

//File�N���X�̏ꍇ�̉��Z�q