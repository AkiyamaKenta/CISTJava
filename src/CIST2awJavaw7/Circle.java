package CIST2awJavaw7;

public class Circle {

    private float r;

    public Circle(){
        this.r = 1;
    }

    public void ensyu(){
        System.out.println("円周の長さは" + r * 2.0 * 3.14);
    }

    public void menseki(){
        System.out.println("円の面積は" + r * r * 3.14);
    }

    public void SetR(float r){
        if(0 < r){
            this.r = r;
        }
        else {
            this.r = 1;
        }
    }
}
