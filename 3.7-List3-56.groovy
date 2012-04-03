Map map = [a:1,b:2,c:3]
assert map['a'] == 1
assert map.a == 1
keyname = 'a'
assert map."$keyname" == 1
assert map[keyname] == 1

//マップの要素のアクセス