package CIST2awJavaw9;

public class Shikaku extends Zukei{

    public Shikaku(float tate, float yoko, float takasa){
        super.tate = tate;
        super.yoko = yoko;
        super.takasa = takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate = super.tate;
        float yoko = super.yoko;
        float ans = tate * yoko;
        return ans;
    }

}
