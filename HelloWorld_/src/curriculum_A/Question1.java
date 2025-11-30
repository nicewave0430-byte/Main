package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		
		        byte byteNum = 10;
		        short shortNum = 100;
		        int intNum = 1000;
		        long longNum = 10000L;
		        float floatNum = 1.5f;
		        double doubleNum = 2.5;
		        char charVar = 'あ';
		        String stringVar = "こんにちは";
		        boolean booleanVar = true;

		        byteNum = 111;
		        shortNum = 20;
		        intNum = 11130;
		        longNum = 100000L;
		        floatNum = 1E+10f;
		        doubleNum = 0.105;
		        charVar = 'ハ';
		        stringVar = "true";
		        booleanVar = false;

		        System.out.println(byteNum);
		        System.out.println(shortNum);
		        System.out.println(intNum);
		        System.out.println(longNum);
		        System.out.println(floatNum);
		        System.out.println(doubleNum);
		        System.out.println(charVar);
		        System.out.println(stringVar);
		        System.out.println(booleanVar);

		        String name = "山田太郎";
		        System.out.println("名前：" + name);
		      
		       System.out.println("こんにちは！" + name + "さん！");

		        int age = 25;
		        System.out.println("年齢：" + age);

		        int num1 = 10;
		        int num2 = 5;
		        int sum = num1 + num2;
		        System.out.println("合計：" + sum);

		        int score = 80;
		        score = 20;
		        score = 100;
		        System.out.println("score：" + score);
		     
		        double price = 99.99;
		        int priceInt = (int) price;  // 小数点以下切り捨て
		        System.out.println("整数価格: " + priceInt);

		        
		        String numStr = "123";
		        int numConverted = Integer.parseInt(numStr);   // String → int
		        System.out.println("変換後の値: " + (numConverted + 10));

		        
		        int num = 50;
		        String numStr2 = String.valueOf(num);  // int → String
		        System.out.println("得点: " + numStr2 + "点");

		        
		        int a = 10;
		        int b = 20;
		        boolean result = (a < b) ? true : false;   // 条件演算子
		        System.out.println(result);
		        
		        int x = 15;
		        String judge = (x >= 10) ? "OK" : "NG";     // 条件演算子
		        System.out.println(judge);

		        
		        String text = "私はJavaが好きです。Javaは楽しい！";
		        String replaced = text.replace("Java", "Python"); // 置換
		        System.out.println(replaced);

    }
}
		
		
		
		
