import static groovyx.gpars.actor.Actors.*

def console = actor{
	loop{
		react{message ->
			println "[${new Date().format('yyyy-MM-dd HH:mm:ss.SSS')}] $message"

			sleep 1000
		}
	}
}

def workers = (1..5).collect{id ->
	actor{
		loop{
			console.send "I'm ${id}th worker!"
			sleep 100
		}
	}
}

[console,*workers]*.join()

//アクタープログラミング