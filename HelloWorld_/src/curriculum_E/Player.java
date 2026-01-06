package curriculum_E;

import java.util.Scanner;

public class Player {
	private int hand;

	public void inputHand(Scanner sc) {
		while (true) {
			System.out.print("グー(0)、チョキ(1)、パー(2)を入力：");

			// 数字以外対策
			if (!sc.hasNextInt()) {
				System.out.println("数字を入力してください。");
				sc.next(); // 入力を捨てる
				continue;
			}

			int input = sc.nextInt();

			// 範囲チェック
			if (input < 0 || input > 2) {
				System.out.println("0〜2で入力してください。");
				continue;
			}

			hand = input;
			break;
		}
	}

	public int getHand() {
		return hand;
	}
}
