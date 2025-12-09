package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//Q2
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		//Q3
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		//Q4
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("合計: " + sum);

		//Q5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//Q6
		int i2 = 1;

		while (i2 <= 10) {
			System.out.println(i2);
			i2++;
		}
		//Q7
		int i3 = 2;

		while (i3 <= 20) {
			System.out.println(i3);
			i3 += 2;
		}
		//Q8
		int i4 = 10;

		while (i4 >= 1) {
			System.out.println(i4);
			i4--;
		}
		//Q9
		int i5 = 1;
		int sum1 = 0;

		while (i5 <= 100) {
			sum1 += i5;
			i5++;
		}
		System.out.println(sum1);

		//Q10
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("数値を入力してください：");
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("終了しました");
				break;
			}
		}

		sc.close();

		//Q11
		for (int i6 = 1; i6 <= 9; i6++) {
			for (int j = 1; j <= 9; j++) {
				int result = i6 * j;
				System.out.printf("%02d x %02d = %02d | ", i6, j, result);
			}
			System.out.println();
		}
	}
}
