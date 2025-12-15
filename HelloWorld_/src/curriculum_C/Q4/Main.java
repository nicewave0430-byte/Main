package curriculum_C.Q4;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee full = new FullTimeEmployee("E001", "山田太郎");
        PartTimeEmployee part = new PartTimeEmployee("E002", "田中花子");

        System.out.println("正社員の給与: " + full.calculateDailyWage(9) + "円");
        System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + "円");
    }
}
