package CIST2awJavaw9;

public class Zukei {

    protected float tate;
    protected float yoko;
    protected float takasa;

    protected float calcMenseki(){
        return 0.0f;
    }

    protected float calcsTaiseki(){
        return calcMenseki() * takasa;
    }

    public void print(){
        float ans = calcMenseki();
        float ans2 = calcsTaiseki();
        System.out.println("面積=" + ans + ", 体積=" + ans2);
    }

}
