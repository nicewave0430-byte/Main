package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		
		        byte byteNum = 0;
		        short shortNum = 0;
		        int intNum = 0;
		        long longNum = 0L;
		        float floatNum = 0.0f;
		        double doubleNum = 0.0;
		        char letter= '\u0000';
		        String letters = null;
		        boolean isboolean = false;  //Q1修正1202

		        byteNum = 10;
		        shortNum = 100;
		        intNum = 1000;
		        longNum = 10000;
		        floatNum = 9.5f;
		        doubleNum = 10.5;
		        letter = 'a';
		        letters = "ハロー";
		        isboolean = true;      //Q2

		        System.out.println(byteNum+shortNum+intNum+longNum);    //11110
		        System.out.println((int)(floatNum + doubleNum));     // 20
		        System.out.println(letter+" "+letters+" "+isboolean);  //a ハロー　true
		        System.out.println((int)(intNum+longNum+shortNum+floatNum+doubleNum+byteNum));      //11130
		        double answer =  byteNum * shortNum * intNum * longNum;
		        System.out.printf("%.0E\n", answer);          //1E+10
		        System.out.println(doubleNum/shortNum);   //0.105
		        System.out.println(byteNum- shortNum);    //-90
		        //Q3修正1202
		        
		        String name = "山田太郎";
		        System.out.println("名前：" + name);
		       System.out.println("こんにちは！" + name + "さん！");  //Q4

		        int age = 25;
		        System.out.println("年齢：" + age);         //Q5

		        int num1 = 10;
		        int num2 = 5;
		        int sum = num1 + num2;
		        System.out.println("合計：" + sum);      //Q6
		        
		        int score = 80;   // 初期値として80を入れる
		        score += 20;      // 20だけ自己代入で足す
		        System.out.println("score:" + score);    //Q7

		     
		        double price = 99.99;
		        int priceInt = (int) price;  // 小数点以下切り捨て
		        System.out.println("整数価格: " + priceInt);     //Q8

		        
		        String numStr = "123";
		        int numConverted = Integer.parseInt(numStr);   // String → int
		        System.out.println("変換後の値: " + (numConverted + 10)); //Q9

		        
		        int num = 50;
		        String numStr2 = String.valueOf(num);  // int → String
		        System.out.println("得点: " + numStr2 + "点");    //Q10

		        
		        int a = 10;
		        int b = 20;
		        boolean result = (a < b) ? true : false;   
		        System.out.println(result);        //Q11
		        
		        int x = 15;
		        String judge = (x >= 10) ? "OK" : "NG";     //Q12
		        System.out.println(judge);

		        
		        String text = "私はJavaが好きです。Javaは楽しい！";
		        String replaced = text.replace("Java", "Python");  
		        System.out.println(replaced);   //Q13

    }
}
		
		
		
		
