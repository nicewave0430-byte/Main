package curriculum_E;

import java.util.Random;

public class CPU {
	private int hand;

	public void generateHand() {
		Random rand = new Random();
		hand = rand.nextInt(3);
	}

	public int getHand() {
		return hand;
	}
}
