package CIST2awJavaw9;

import java.util.Scanner;

public class ZukeiApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("縦:");
        float tate = input.nextFloat();
        System.out.print("横:");
        float yoko = input.nextFloat();
        System.out.print("高さ:");
        float takasa = input.nextFloat();

        Shikaku shikaku = new Shikaku(tate, yoko, takasa);
        shikaku.print();
        Sankaku sankaku = new Sankaku(tate, yoko, takasa);
        sankaku.print();
        
    }
}
