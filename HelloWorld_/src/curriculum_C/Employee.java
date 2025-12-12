package curriculum_C;

public class Employee {

    // Q1
    String name;

    public void work() {
        System.out.println(name + "は働いています。");
    }

    // ▼ Q2 追加部分 ▼
    String employeeId;

    public void showInfo() {
        System.out.println("社員ID: " + employeeId + "、名前: " + name);
    }
}

