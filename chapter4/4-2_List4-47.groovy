def file = new File('dummy.txt')
file.delete()
file <<'aaa\n'<<'bbb\n'
assert file.text == 'aaa\nbbb\n'

//Fileクラスの場合の演算子