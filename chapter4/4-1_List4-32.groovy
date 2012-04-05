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

//ƒe[ƒuƒ‹‚Ìì¬