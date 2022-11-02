package CIST2awJavaw2;

import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {

        System.out.println("何かキーを押してください");
        int a = System.in.read();
        System.out.println(a);
        a = System.in.read();
        System.out.println(a);

    }
}
