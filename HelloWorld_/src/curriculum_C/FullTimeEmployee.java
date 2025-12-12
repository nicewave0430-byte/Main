package curriculum_C;

public class FullTimeEmployee extends Employee4 {

	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int baseHours = Math.min(8, hoursWorked);
		int overtime = Math.max(0, hoursWorked - 8);

		int basePay = baseHours * HOURLY_RATE;
		int overtimePay = (int) (overtime * HOURLY_RATE * 1.25);

		return basePay + overtimePay;
	}
}
