package execution;

import process.Process;

public class Execution {

	public static void main(String[] args) {

		// 情報を格納しているインスタンスを作成
		Process process = new Process("こんにちは","日本","寿司","和食");
		// 現在時刻を表示させるメソッドの呼び出し
		process.nowTime();
		
	}

}
