package curriculumD;

public class Main {
	public static void main(String[] args) {

		// 問題5：weight の 60 を引数に追加
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 問題8・9：printメソッドで自己紹介＋BMIを出力
		person1.print();

		// 問題10：人数の合計を出力（static変数 count を利用）
		System.out.println("合計" + Person.count + "人です");
	}
}
