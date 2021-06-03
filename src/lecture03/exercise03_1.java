package lecture03;

import java.util.Scanner;

public class exercise03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください:");
        String input = scanner.nextLine(); // 入力された1行分の文字列を読み取って返す
        System.out.println("“" + input + "” と入力されました");
    }
}
