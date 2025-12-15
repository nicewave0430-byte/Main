package curriculum_C.Q7;

public class SalaryReportPrinter {
	public void print(Payable p) {
		System.out.println(p.getName() + "の給料は" + p.calculateSalary() + "円");
	}
}
