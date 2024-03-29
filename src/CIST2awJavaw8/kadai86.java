package CIST2awJavaw8;

import java.util.Scanner;

public class kadai86 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("部活名を入力");
        String clubName = input.next();
        System.out.print("顧問の名前を入力");
        String komonname = input.next();
        System.out.print("学籍番号は");
        String komongakuseki = input.next();

        Club club = new Club(clubName, komonname, komongakuseki);

        while (true) {

            System.out.println("入部=1、表示=2、退部=3, 終了=0");
            System.out.print("数字を入力");

            int i = input.nextInt();

            if (i == 1) {
                System.out.print("学籍番号を入力:");
                String gakusei = input.next();

                System.out.print("氏名を入力");
                String shimei = input.next();

                Member member = new Member(gakusei, shimei);
                club.join(member);
            }

            else if (i == 2) {
                club.print();
            }

            else if (i == 0) {
                System.exit(0);
            }

            else if (i == 3) {
                System.out.print("退部の学籍番号を入力:");
                System.out.print("学籍番号を入力:");
                String gakusei = input.next();
                club.remove(gakusei);
            }
        }
    }
}
