package CIST2awJavaw3;

import java.util.Scanner;

public class Array2DMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] ij = new int[5][5];

        int x = 2;
        int y = 2;

        while (true){
            for (int i=0;i<ij.length;i++) {
                for (int j = 0; j < ij.length; j++) {

                    ij[i][j] = 0;

                    if (i == x && j == y) {
                        ij[i][j] = 1;
                    }

                    System.out.print(ij[i][j] + " ");
                }
                System.out.println("");
            }
                    System.out.print("どちらに移動する？:");
                    String key = input.next();

                    switch (key) {
                        case "w":
                            x = x - 1;
                            if (x < 0) {
                                System.out.println("キャラクター1が消えたため終了");
                                System.exit(0);
                            }
                            System.out.println("上に移動");
                            break;
                        case "a":
                            y = y - 1;
                            if (x < 0) {
                                System.out.println("キャラクター1が消えたため終了");
                                System.exit(0);
                            }
                            System.out.println("左に移動");
                            break;
                        case "s":
                            x = x + 1;
                            if (x >= 5) {
                                System.out.println("キャラクター1が消えたため終了");
                                System.exit(0);
                            }
                            System.out.println("下に移動");
                            break;
                        case "d":
                            y = y + 1;
                            if (y >= 5) {
                                System.out.println("キャラクター1が消えたため終了");
                                System.exit(0);
                            }
                            System.out.println("右に移動");
                            break;
                        case "q":
                            System.out.println("終了");
                            System.exit(0);

            }
        }
    }
}
