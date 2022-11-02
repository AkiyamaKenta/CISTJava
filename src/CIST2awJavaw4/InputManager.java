package CIST2awJavaw4;

import java.util.Scanner;

public class InputManager {

    int scan(String x) {

        Scanner input = new Scanner(System.in);

        System.out.print(x + " = ");
        return input.nextInt();
    }

}
