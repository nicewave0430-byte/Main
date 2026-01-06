package curriculum_E;

import java.util.Random;

public class CPU {
	private int hand;
	private final Random rand = new Random();

	public void generateHand() {
		hand = rand.nextInt(3);
	}

	public int getHand() {
		return hand;
	}
}
