package CIST2awJavaw6;

public class Target {

    String label;
    int x;
    int y;

    void hidari(){
        if (x>0){
            x = x-1;
        }
    }
    void migi(){
        if (x<4){
            x = x+1;
        }
    }
    void ue(){
        if (y>0){
            y = y-1;
        }
    }
    void shita(){
        if (y<4){
            y = y+1;
        }
    }

    void move(String key){
        if (key.equals("w")){
            ue();
        }
        if (key.equals("a")){
            hidari();
        }
        if (key.equals("s")){
            shita();
        }
        if (key.equals("d")){
            migi();
        }
    }
}
