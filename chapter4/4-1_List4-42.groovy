@Grab('org.apache.derby:derby:[10.5.3,)')
@GrabConfig(systemClassLoader=true)
import groovy.sql.Sql

def sql = Sql.newInstance('jdbc:derby:memory:testdb;create=true',
	'user','password','org.apache.derby.jdbc.EmbeddedDriver')

try{
	sql.execute('''drop table BANKACCOUNT''')
}catch(Exception e){}

sql.execute('''create table BANKACCOUNT(
	id integer not null primary key,
	name varchar(20),
	amount decimal
)''')

sql.execute('''
	insert into BANKACCOUNT (id,name,amount)
	values(1,'Guillaume',10000)
''')

sql.execute('''
	insert into BANKACCOUNT (id,name,amount)
	values(2,'Dierk',10000)
''')

def transfer = 100
def from = sql.firstRow("select amount from BANKACCOUNT where id=1")[0]
def to = sql.firstRow("select amount from BANKACCOUNT where id=2")[0]

try{
	sql.withTransaction{
	sql.execute("""
		update BANKACCOUNT set amount=${from-transfer}
		where id=1
	""")
	sql.execute("""
		update BANKACCOUNT set ammount=${to+transfer}
		where id=2
	""")
	}
}catch(e){}

def accounts = sql.rows('select * from BANKACCOUNT')
println accounts

//withTransfaction()ÇÃó·(ê≥â)