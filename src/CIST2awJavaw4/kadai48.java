package CIST2awJavaw4;

public class kadai48 {
    public static void main(String[] args) {

        InputManager input = new InputManager();
        Hantei judge = new Hantei();

        int a = input.scan("a");
        int b = input.scan("b");
        judge.evenOrOdd(a);

        System.exit(0);

    }
}
