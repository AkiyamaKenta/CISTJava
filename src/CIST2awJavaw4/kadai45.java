package CIST2awJavaw4;

import java.util.Scanner;

public class kadai45 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        Comparison2 comp = new Comparison2();
        comp.getMax(a,b);
        comp.getMin(a,b);
        comp.Show();

    }

}
