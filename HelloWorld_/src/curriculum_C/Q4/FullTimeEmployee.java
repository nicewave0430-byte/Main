package curriculum_C.Q4;

public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * 1.25);
	}
}
 