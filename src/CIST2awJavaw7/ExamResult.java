package CIST2awJavaw7;

public class ExamResult {

    private String name;
    private int point;

    public ExamResult(String name, int point) {
        this.name = name;
        this.point = point;
    }

public void change(int newpoint){
        if(newpoint > 0 && newpoint <= 100){
            point = newpoint;
        }
        else {
            point = 0;
        }
}



    public String decide(int border){

        if(this.point >= border){
                return "合格";
        }
        else {
            return "不合格";
        }
    }



}
