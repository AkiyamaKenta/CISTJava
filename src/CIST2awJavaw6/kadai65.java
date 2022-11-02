package CIST2awJavaw6;

import java.util.Random;
import java.util.Scanner;

public class kadai65 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        Target tA = new Target();
        tA.label = "A";
        tA.x = 4;
        tA.y = 4;

        int gx = rand.nextInt(4);
        int gy = rand.nextInt(4);
        Target tG = new Target();
        tG.label = "G";
        tG.x = gx;
        tG.y = gy;

        while (true) {

            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {

                    if (x == tA.x && y == tA.y) {
                        System.out.print("A");
                    }
                    else if (x == tG.x && y == tG.y) {
                        System.out.print("G");
                    }
                    else {
                        System.out.print("#");
                    }

                }

                System.out.println();

            }

            System.out.print("どちらに移動する?");
            String key = input.next();
            tA.move(key);

            if (tA.x == tG.x && tA.y == tG.y) {
                System.out.println("Goal!");
                System.exit(0);
            }

        }
    }

}

