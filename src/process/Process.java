package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Process {

	
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
