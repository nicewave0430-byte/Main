package curriculum_B;

public class Animal {

    // フィールド（クラスが持つ変数）
    private String name;   // 動物名
    private double length; // 体長
    private int speed;     // 速度

    // setter（値をセットする）
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter（値を取得する）
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }
}
