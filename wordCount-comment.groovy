//指定したテキストファイル中の単語の出現回数を一覧表示する					//コメント行
	def map = [:]											//変数mapを定義。初期値として空のマップを与える
															//defは型を指定しないやり方
															//マップのリテラル:「キー:値」（HashMap的）
	
	new File(args[0]).eachLine{								//args:コマンドライン引数
															//File():java.io.Fileクラスのインスタンス生成
															//importは必要なし
															//eachLine:各行に対して処理を行うというメソッド
															//{〜}はクロージャ。ブロック文ではない。処理のまとまり。
		
		/*File().eachLine{}:ファイルをオープンし、そのファイルの各行に対してクロージャで指定した処理を行い、ファイルをクローズする*/
		/*try catchは不要。各行の内容はitという暗黙の変数で扱わる*/
		
		it.split(/\s+/).each {								//'/\s+/':\s+の意味（空白文字の１回以上の繰り返し
															//各行を空白で分割してさらにそれぞれの単語を見る
															//ここでのitはさっきのitとは違う
			map[it] = (map[it]==null) ? 1 : (map[it]+1)		
			
			/*初めて出現した単語の場合（map[it]==null）、マップ中にエントリが存在しないため１を初期値とする。
			 * ２回目以降出現した単語の場合、マップのエントリに１を加算する
			 */
		}
	}
	map.entrySet().sort{it.value}.each {					//mapのエントリーセットを取り出し、そのvalueでソート
															//それぞれを処理
		/*entrySetはjavaのHashMapのentrySetを呼び出している。得られるのはSet型のオブジェクト
		 * sortはGroovyのメソッド。クロージャの引数を元にしてソート
		 */
		println "${it.value} : [${it.key}]"					//それぞれの値とキーを出力(println。カッコ省略)
															//${}で囲まれた式はその式の値が実行時に評価される
			}

	//ポイント1.クラスやメソッドの定義をする必要がない。実行はスクリプトの先頭から行われる
	
		
