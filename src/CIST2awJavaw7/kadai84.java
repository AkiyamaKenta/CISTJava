package CIST2awJavaw7;

public class kadai84 {

    public static void main(String[] args) {
        ExamResult r1 = new ExamResult("Hikali", 79);
        String kekka1 = r1.decide(80);
        System.out.println(kekka1);

        r1.change(81);
        String kekka2 = r1.decide(80);
        System.out.println(kekka2);

    }
}
