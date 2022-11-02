package CIST2awJavaw5;

public class TriangleFinder {
    Triangle[] tf = new Triangle[3];

    void maxmenseki(){
        int maxid = 0;
        float max = tf[0].menseki();
        for(int i = 0; i < tf.length; i++){
            if(max < tf[i].menseki()){
                maxid = i;
                max = tf[i].menseki();
            }
        }

        System.out.println("最も面積が大きいのは配列番号"+maxid+"の"+max);

    }

    void maxtaiseki(){
        int maxid = 0;
        float max = tf[0].taiseki();
        for(int i = 0; i < tf.length; i++){
            if(max < tf[i].taiseki()){
                maxid = i;
                max = tf[i].taiseki();
            }
        }

        System.out.println("最も体積が大きいのは配列番号"+maxid+"の"+max);

    }
}
