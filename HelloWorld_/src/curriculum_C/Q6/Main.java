package curriculum_C.Q6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> list = new ArrayList<>();
		list.add(new FullTimeEmployee("F001", "佐藤"));
		list.add(new ContractEmployee("C001", "鈴木"));

		for (Billable b : list) {
			System.out.println("日給: " + b.costForDay(9) + "円");
		}
	}
}
