package curriculum_C;

public abstract class Employee4 {
    private String employeeId;
    private String name;

    public Employee4(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateDailyWage(int hoursWorked);
}
