package CIST2awJavaw4;

public class Comparison2 {

    int ma, mi;

    void getMax(int a, int b){
        ma = Math.max(a, b);
    }

    void getMin(int c, int d) {
        mi = Math.min(c, d);
    }

    public void Show (){
        System.out.println("max = " +ma);
        System.out.println("min = " +mi);
    }

}
