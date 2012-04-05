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

def personSet = sql.dataSet("PERSON")

personSet.add(
	id:1,firstname:'Guillaume',lastname:'Laforge',
	location_id:10,location_name:'Paris')

personSet.add(
	id:2,firstname:'Dierk',lastname:'Konig',
	location_id:20,location_name:'Zurich')

personSet.add(
	id:3,firstname:'Paul',lastname:'King',
	location_id:30,location_name:'Brisbane')

personSet.each{
	println it.firstname
}

personSet.findAll{it.firstname=='Dierk'}.each{
	println it
}

//DataSet‚Ì—á