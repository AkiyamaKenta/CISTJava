package CIST2awJavaw5;

import java.util.Scanner;

public class kadai56 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        float x = input.nextFloat();
        System.out.print("y = ");
        float y = input.nextFloat();
        System.out.print("z = ");
        float z = input.nextFloat();

        Square s = new Square();
        s.tate = x;
        s.yoko = y;
        s.takasa = z;
        float sm  = s.taiseki();
        System.out.println("四角柱の体積は " + sm);

        Triangle t = new Triangle();
        t.tate = x;
        t.yoko = y;
        t.takasa = z;
        float tm  = t.taiseki();
        System.out.println("三角柱の体積は " + tm);
    }

}
