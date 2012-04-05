Calendar calendar = Calendar.getInstance()
calendar.with{
	clear()
	set(MONTH,JULY)
	set(DATE,4)
	set(YEAR,1776)
	println time
}

//with()を使ったCalendarクラスのインスタンスのセットアップ