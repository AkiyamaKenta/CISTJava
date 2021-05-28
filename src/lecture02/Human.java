package lecture02;

public class Human {
    String name;
    int age;

    // コンストラクタ (nameとageを初期化)
    Human(String name, int age) {
        this.name = name; // フィールドnameを引数nameで初期化
        this.age = age; // フィールドageを引数ageで初期化
    }

    void print() {
        if (this.age <= 18) {
            System.out.println("生徒:" + this.name + " " + this.age + "歳です。");
        }else if(this.age <= 22) {
            System.out.println("学生:" + this.name + " " + this.age + "歳です。");
        }
    }
}
