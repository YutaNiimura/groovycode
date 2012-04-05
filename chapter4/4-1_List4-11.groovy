def cli = new CliBuilder(usage:'groovy CliBuilderSample.groovy -f filename [-d]')

cli.with{
	h longOpt:'help','�w���v'
	f longOpt:'file',required:true,args:1,'�����Ώۃt�@�C����'
	d longOpt:'debug','�f�o�b�O���[�h'
}
def options = cli.parse(args)

if(!options) return

if(options.h){
	cli.usage()
	return
}

if(options.f) println "�I�v�V����-f���w�肳��܂���(����=${options.f})"
if(options.d) println "�I�v�V����-d���w�肳��܂���"

///CliBuilder�̎g����(with���g������������)