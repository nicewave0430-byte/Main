package curriculum_C;

public abstract class Employee3 {

    protected String employeeId;
    protected String name;

    // コンストラクタ
    public Employee3(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    // getter
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    // 抽象メソッド（サブクラスが実装する）
    public abstract int calculateDailyWage(int hoursWorked);
}
