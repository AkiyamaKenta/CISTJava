package CIST2awJavaw4;

public class kadai47 {

    public static void main(String[] args) {

        InputManager input = new InputManager();
        Comparison3 comp = new Comparison3();

        int a = input.scan("a");
        int b = input.scan("b");
        comp.MaxMinShow(a, b);

        System.exit(0);

    }
}
