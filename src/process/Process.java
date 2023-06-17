package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Process {
	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
	
	public String greeting;
	public String country;
	public String food;
	public String style;
	
	public Process(String greeting, String country, String food, String style) {
		this.greeting = greeting;
		this.country = country;
		this.food = food;
		this.style = style;
		
		System.out.println(greeting + "!" + "ここは" + country + "です！");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + style + "です");
	}
	

	public  void nowTime() {

		// 現在の日時を取得
		Calendar calendar = Calendar.getInstance();
		// 日時の形式を指定
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 指定形式に変換した日時をコンソールに出力
        System.out.println("今の現在時刻は" + format.format(calendar.getTime()) + "です");
        
	}

}
