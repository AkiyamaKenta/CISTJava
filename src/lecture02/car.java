package lecture02;

public class car {

    int fuel;

    // コンストラクタ (fuelを0で初期化)
    public car() {
        this.fuel = 0;
    }

    void run() {
        if(this.fuel > 0) {
            this.fuel -= 1; // 燃料を1消費
            System.out.println("燃料を1消費して走りました。");
        }else {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }
}
