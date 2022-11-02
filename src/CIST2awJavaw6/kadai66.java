package CIST2awJavaw6;

import java.util.Random;
import java.util.Scanner;

public class kadai66 {

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

        int ex = rand.nextInt(4);
        int ey = rand.nextInt(4);
        Target tE = new Target();
        tE.label = "E";
        tE.x = ex;
        tE.y = ey;


        while (true) {

            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {

                    if (x == tA.x && y == tA.y) {
                        System.out.print("A");
                    }
                    else if (x == tG.x && y == tG.y) {
                        System.out.print("G");
                    }
                    else if (x == tE.x && y == tE.y) {
                        System.out.print("E");
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

            int moverandomG = rand.nextInt(4);
            if (moverandomG == 0){
                tG.ue();
            }
            if (moverandomG == 1){
                tG.shita();
            }
            if (moverandomG == 2){
                tG.migi();
            }
            if (moverandomG == 3){
                tG.hidari();
            }

            int moverandomE = rand.nextInt(4);
            if (moverandomE == 0){
                tE.ue();
            }
            if (moverandomE == 1){
                tE.shita();
            }
            if (moverandomE == 2){
                tE.migi();
            }
            if (moverandomE == 3){
                tE.hidari();
            }

            if (tA.x == tE.x && tA.y == tE.y) {
                System.out.println("You Lose..");
                System.exit(0);
            }


            if (tA.x == tG.x && tA.y == tG.y) {
                System.out.println("Goal!");
                System.exit(0);
            }

        }
    }

}
