def target = System.properties['env.target']
def ant = new AntBuilder()

ant.echo("Target Environment: ${target}")

switch(target){
	case 'test':
		ant.echo('test')
		break
	case 'prod':
		ant.echo('prod')
		break
	default:
		ant.echo('target missing: -Denv.target=test/prod')
}

//ğŒ•ªŠò‚Ì‚ ‚éƒrƒ‹ƒh(AntBuilder)