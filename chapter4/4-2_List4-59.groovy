new File('output.txt').withWriter{writer ->
	writer << "line1 of text\n"
	writer << "line2 of text\n"
}

//ファイルへの書き出し