def server = new ServerSocket(5000)
while(true){
	server.accept{socket ->
		socket.withStreams{input,output ->
			output << "Enter command: "
			output.flush()
			def r = new InputStreamReader(input).readLine()
			System.err.println "Received: $r"
		}
	}
}

//TCP/IP��Socket�ڑ����󂯕t����T�[�o