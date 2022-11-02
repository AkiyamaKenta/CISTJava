package CIST2awJavaw4;

import java.util.Scanner;

public class kadai42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        Comparison comp = new Comparison();
        int x = comp.getMax(a,b);
        int y = comp.getMin(a,b);
        System.out.println("max = " + x);
        System.out.println("min = " + y);
    }

}
