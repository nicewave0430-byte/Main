package curriculum_C.Q7;

public class Main {
	public static void main(String[] args) {
		SalaryReportPrinter printer = new SalaryReportPrinter();

		Payable a = new FullTimeEmployee("山田", 10);
		Payable b = new ContractEmployee("佐藤", 10);

		printer.print(a);
		printer.print(b);
	}
}
