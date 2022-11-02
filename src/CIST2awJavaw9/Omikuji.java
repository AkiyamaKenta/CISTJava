package CIST2awJavaw9;

public class Omikuji {

    String unsei;
    String setsumei;

    public Omikuji(String unsei, String setsumei) {
        this.unsei = unsei;
        this.setsumei = setsumei;
    }

    public void print(){
        String str = "今日の運勢：" + unsei + "、" + setsumei;
        System.out.println(str);
    }
}
