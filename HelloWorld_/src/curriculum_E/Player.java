package curriculum_E;

import java.util.Scanner;

public class Player {
	private int hand;

	public void inputHand() {
		Scanner sc = new Scanner(System.in);
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		hand = sc.nextInt();
	}

	public int getHand() {
		return hand;
	}
}
