package CIST2awJavaw2;

public class MultiTable {
    public static void main(String[] args) {
        for (int x = 1;x <= 9;x++) {
            System.out.print(x + "の段\t");
            for (int y = 1; y <= 9; y++) {
                int ans = x * y;
                System.out.print(ans + "\t");
            }
            System.out.println("");
        }

    }
}
