package curriculum_E;

public class Question6 {

	public static void main(String[] args) {

		Player player = new Player();
		CPU cpu = new CPU();

		boolean win = false;

		while (!win) {
			player.inputHand();
			cpu.generateHand();

			int p = player.getHand();
			int c = cpu.getHand();

			System.out.println("あなたの手: " + handName(p));
			System.out.println("CPUの手: " + handName(c));

			int result = (p - c + 3) % 3;

			if (result == 1) {
				System.out.println("あなたの勝ち！");
				win = true;
			} else if (result == 2) {
				System.out.println("あなたの負け！");
			} else {
				System.out.println("あいこ！");
			}
		}
	}

	private static String handName(int hand) {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不正な手";
		}
	}
}
