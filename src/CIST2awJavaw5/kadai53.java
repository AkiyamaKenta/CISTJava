package CIST2awJavaw5;

public class kadai53 {
    public static void main(String[] args) {

        Multichecker check = new Multichecker();

        Multichecker mc1 = new Multichecker();
        mc1.arg = 3;

        Multichecker mc2 = new Multichecker();
        mc2.arg = 5;

        String ans1 = mc1.check(225);
        System.out.println(ans1);
        String ans2 = mc2.check(225);
        System.out.println(ans2);
    }

}
