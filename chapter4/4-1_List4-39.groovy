@Grab('org.apache.derby:derby:[10.5.3,)')
@GrabConfig(systemClassLoader=true)
import groovy.sql.Sql

def sql = Sql.newInstance('jdbc:derby:memory:testdb;create=true',
	'user','password','org.apache.derby.jdbc.EmbeddedDriver')

sql.execute('''create table PERSON (
	id integer not null primary key,
	firstname varchar(20),
	lastname varchar(20),
	location_id integer,
	location_name varchar(30)
)''')


def persons = [
	[id:1,first:'Guillaume',last:'Laforge',locid:10,loc:'Paris'],
	[id:2,first:'Dierk',last:'Konig',locid:20,loc:'Zurich'],
	[id:3,first:'Paul',last:'King',locid:30,loc:'Brisbane']
]
persons.each{ p->
	sql.execute """
		insert into PERSON (id,firstname,lastname,location_id,location_name)
		values(${p.id},${p.first},${p.last},${p.locid},${p.loc})
	"""
}

def personList = sql.rows('select * from PERSON')

println ' Person Info '.center(25,'-')
personList.each{ p->
	println "${p.id}:${p.firstname} ${p.lastname}"
	println "Location: ${p.location_name}(${p.location_id})"
	println '-'*25
}
//rows()‚É‚æ‚éˆ—