package curriculum_C;

import java.util.ArrayList;
import java.util.List;

public class MAINOBJECT {

	public static void main(String[] args) {

		// ===== Q1 =====
		Employee emp = new Employee();
		emp.name = "山田太郎";
		emp.work();

		// ===== Q2 =====
		Employee emp2 = new Employee();
		emp2.employeeId = "E001";
		emp2.name = "佐藤太郎";
		emp2.showInfo();

		// ===== Q3 =====
		Employee2 emp3 = new Employee2();

		emp3.setEmployeeId("E002");
		emp3.setName("田中花子");

		System.out.println("社員ID: " + emp3.getEmployeeId() + ", 名前: " + emp3.getName());

		// ===== Q4 =====
		FullTimeEmployee f = new FullTimeEmployee("F001", "田中太郎");
		PartTimeEmployee p = new PartTimeEmployee("P001", "佐藤花子");

		int fullPay = f.calculateDailyWage(9);
		int partPay = p.calculateDailyWage(9);

		System.out.println("正社員の給与: " + fullPay + "円");
		System.out.println("パート社員の給与: " + partPay + "円");

		// ===== Q5 & Q6 共通で使う型定義 =====

		// インターフェース（Q6の①）
		interface Billable {
			int costForDay(int hoursWorked);
		}

		// 抽象クラス Employee（Q6の②）
		abstract class EmployeeBase implements Billable {
			protected String id;
			protected String name;

			public EmployeeBase(String id, String name) {
				this.id = id;
				this.name = name;
			}

			public String getName() {
				return name;
			}

			// Q6の要件どおり：costForDay は抽象メソッド
			@Override
			public abstract int costForDay(int hoursWorked);

			// Q5用の「日給メソッド」：中で costForDay を呼ぶだけ
			public int calculateDailyWage(int hoursWorked) {
				return costForDay(hoursWorked);
			}
		}

		// 正社員（Q5・Q6共通）
		class FullTimeEmployeeQ5Q6 extends EmployeeBase {
			public FullTimeEmployeeQ5Q6(String id, String name) {
				super(id, name);
			}

			@Override
			public int costForDay(int hoursWorked) {
				int hourlyRate = 1250;
				int overtime = Math.max(0, hoursWorked - 8);
				int regularHours = hoursWorked - overtime;
				return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
			}
		}

		// 契約社員（Q5・Q6共通）
		class ContractEmployeeQ5Q6 extends EmployeeBase {
			public ContractEmployeeQ5Q6(String id, String name) {
				super(id, name);
			}

			@Override
			public int costForDay(int hoursWorked) {
				int hourlyRate = 1000;
				return hoursWorked * hourlyRate;
			}
		}

		// ===== Q5：ポリモーフィズム（親クラス EmployeeBase 型で扱う） =====
		List<EmployeeBase> employees = new ArrayList<>();
		employees.add(new FullTimeEmployeeQ5Q6("FT001", "山田太郎"));
		employees.add(new FullTimeEmployeeQ5Q6("FT002", "鈴木花子"));
		employees.add(new ContractEmployeeQ5Q6("CT001", "佐藤次郎"));
		employees.add(new ContractEmployeeQ5Q6("CT002", "田中三郎"));

		int hoursWorked = 9;

		for (EmployeeBase emp4 : employees) {
			int wage = emp4.calculateDailyWage(hoursWorked); // ← Q5ではこれを使う
			System.out.println("[Q5] " + emp4.getName() + " さんの日給は " + wage + " 円です。");
		}

		// ===== Q6：インターフェイスと抽象クラス =====
		List<Billable> billables = new ArrayList<>();
		billables.add(new FullTimeEmployeeQ5Q6("F101", "Q6太郎"));
		billables.add(new ContractEmployeeQ5Q6("C101", "Q6花子"));

		for (Billable b : billables) {
			int wage = b.costForDay(8); // ← Q6ではインターフェイス経由で呼ぶ
			System.out.println("[Q6] " + ((EmployeeBase) b).getName() + " さんの日給は " + wage + " 円です。");
		}

		// ===== Q7：SOLID原則（悪い例をリファクタリング） =====

		// 給与を計算できる、という約束（Q7用）
		interface PayableQ7 {
			int costForDay();
		}

		// 共通の社員クラス（名前＋勤務時間）
		abstract class EmployeeQ7 implements PayableQ7 {
			protected String name;
			protected int hours;

			public EmployeeQ7(String name, int hours) {
				this.name = name;
				this.hours = hours;
			}

			public String getName() {
				return name;
			}
		}

		// 正社員（Q7用）
		class FullTimeEmployeeQ7 extends EmployeeQ7 {
			private static final int HOURLY_RATE = 1250;

			public FullTimeEmployeeQ7(String name, int hours) {
				super(name, hours);
			}

			@Override
			public int costForDay() {
				int baseHours = Math.min(8, hours);
				int overtime = Math.max(0, hours - 8);
				int basePay = baseHours * HOURLY_RATE;
				int overtimePay = (int) (overtime * HOURLY_RATE * 1.25);
				return basePay + overtimePay;
			}
		}

		// 契約社員（Q7用）
		class ContractEmployeeQ7 extends EmployeeQ7 {
			private static final int HOURLY_RATE = 1000;

			public ContractEmployeeQ7(String name, int hours) {
				super(name, hours);
			}

			@Override
			public int costForDay() {
				return hours * HOURLY_RATE;
			}
		}

		// 給与レポートを出すクラス（if分岐なし）
		class SalaryCalculatorQ7 {
			public void printSalary(PayableQ7 empQ7) {
				EmployeeQ7 e = (EmployeeQ7) empQ7;
				System.out.println("[Q7] " + e.getName() + " の給料は " + empQ7.costForDay() + " 円です。");
			}
		}

		// Q7の実行
		SalaryCalculatorQ7 calcQ7 = new SalaryCalculatorQ7();
		PayableQ7 q7Emp1 = new FullTimeEmployeeQ7("Q7正社員", 9);
		PayableQ7 q7Emp2 = new ContractEmployeeQ7("Q7契約社員", 9);

		calcQ7.printSalary(q7Emp1);
		calcQ7.printSalary(q7Emp2);
	}
}
