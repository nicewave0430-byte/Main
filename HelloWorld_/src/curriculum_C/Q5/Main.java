package curriculum_C.Q5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("F001", "佐藤"));
		employees.add(new ContractEmployee("C001", "鈴木"));
		employees.add(new FullTimeEmployee("F002", "高橋"));

		for (Employee e : employees) {
			int wage = e.calculateDailyWage(9);
			System.out.println(e.name + "の給与は" + wage + "円");
		}
	}
}
