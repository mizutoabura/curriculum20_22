package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Process {

	// 挨拶を格納する変数
	public String greeting;
	// 国名を格納する変数
	public String country;
	// 食べ物を格納する変数
	public String food;
	// 食べ物の様式を格納する変数
	public String style;
	
	// 受け取った引数をコメントにあてはめてコンソールに出力するコンストラクタ
	public Process(String greeting, String country, String food, String style) {
		
		// 受け取った引数を変数に代入
		this.greeting = greeting;
		// 受け取った引数を変数に代入
		this.country = country;
		// 受け取った引数を変数に代入
		this.food = food;
		// 受け取った引数を変数に代入
		this.style = style;
		
		// コンストラクタに変数をあてはめたメッセージを出力
		System.out.println(greeting + "!" + "ここは" + country + "です！");
		// コンストラクタに変数をあてはめたメッセージを出力
		System.out.println("この" + food + "はうまい");
		// コンストラクタに変数をあてはめたメッセージを出力
		System.out.println(food + "は" + style + "です");
		
	}
	
	// 現在時刻を取得し形式にあてはめ表示
	public  void nowTime() {

		// 現在の日時を取得
		Calendar calendar = Calendar.getInstance();
		// 日時の形式を指定
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 指定形式に変換した日時をコンソールに出力
        System.out.println("今の現在時刻は" + format.format(calendar.getTime()) + "です");
        
	}

}
