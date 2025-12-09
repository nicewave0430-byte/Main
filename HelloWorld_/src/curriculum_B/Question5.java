package curriculum_B;

public class Question5 {

	// Q1
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2：doubleValueメソッド
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3：isEvenメソッド
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {

		helloWorld(); // Q1　実行用

		int number = 10;
		int result = doubleValue(number); // Q2　実行用
		System.out.println(number + " を 2 倍すると " + result + " です。");

		// Q3 実行用
		int num1 = 7;
		int num2 = 10;

		if (isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}

		if (isEven(num1)) {
			System.out.println(num1 + " は偶数です。");
		} else {
			System.out.println(num1 + " は奇数です。");
		}

		// Q4 実行用
		Greeting greeting = new Greeting();
		greeting.sayHello();

		// Animalのインスタンスを作成
		Animal animal = new Animal();

		// setterを使って値をセット
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		// getterを使って値を取り出して表示
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

}
