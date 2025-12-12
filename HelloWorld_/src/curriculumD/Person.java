package curriculumD;

class Person {

    // ===== 問題1：インスタンスフィールド =====
    String name;
    int age;
    double height;
    double weight;   // 問題4 で追加

    // 人数カウント用（問題10）
    static int count = 0;

    // ===== 問題2・3・4：コンストラクタ =====
    // 引数：name, age, height, weight
    Person(String name, int age, double height, double weight) {
        this.name = name;      // 問題3：各フィールドにセット
        this.age = age;
        this.height = height;
        this.weight = weight;

        // 何人インスタンスが生成されたかカウント
        count++;
    }

    // ===== 問題6・7：BMIメソッド =====
    // 戻り値：double
    double bmi() {
        // BMI = 体重(kg) ÷ 身長(m)^2
        return this.weight / (this.height * this.height);
    }

    // ===== 問題8・9：printメソッド =====
    // 戻り値：void
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        // 小数点2桁に揃えるために String.format を使用
        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
    }
}
