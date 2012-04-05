@GrabResolver(name = 'seasar.org',root = 'http://maven.seasar.org/maven2/')
@Grab('net.arnx.jsonic:jsonic:*')
import net.arnx.jsonic.JSON

map = [title:'Groovy Book',author:['Sue','Uehara','Nakano','Sekiya']]
println JSON.encode(map)

//Grapeの利用例（JSONデータ生成）