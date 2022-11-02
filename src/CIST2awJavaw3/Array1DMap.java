package CIST2awJavaw3;

import java.util.Scanner;

public class Array1DMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ia = new int[5];

        int x = 2;

        while (true){
            for (int i=0;i<ia.length;i++){

                ia[i] = 0;

                if (i == x){
                    ia[i] = 1;
                }

                System.out.print(ia[i] + " ");
            }

        System.out.print("どちらに移動する？:");
            String key = input.next();

            switch (key){
                case "a":
                    x = x-1;
                    if(x<0){
                        System.out.println("キャラクター1が消えたため終了");
                        System.exit(0);
                    }
                    System.out.println("左に移動");
                    break;
                case "d":
                    x = x+1;
                    if(x>=5){
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
