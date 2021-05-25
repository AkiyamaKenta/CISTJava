package lecture01;

public class main {
    public static void main(String[] args) {
        //課題1
        System.out.println("B2200090 Kenta Akiyama");
        //課題2
        int studentNumber = 2200090;
        System.out.println("B" + studentNumber + " Kenta Akiyama");
        //課題3
        int age =20;
        if(age<20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }
        else {
            System.out.println("I am "+ age + " years old so I can drink liquor.");
        }
        //課題4
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i]=i+1;
        }
        int sum=0;
        for(int i = 0; i < 50; i++){
            sum=sum+array[i*2];
        }
        System.out.println(sum);
        //課題5
        public class main{
            public static void main(String[] args) {
                int[] score = {41, 85, 72, 38, 80};
                int num=5;
                for (int i = 0; i < 5; i++) {
                    System.out.println("student " + i + " 's point is " + score[i] + "");
                    if (score[i] >= 90) {
                        System.out.println("秀");
                    } else if (score[i] >= 80) {
                        System.out.println("優");
                    } else if (score[i] >= 70) {
                        System.out.println("良");
                    } else if (score[i] >= 60) {
                        System.out.println("可");
                    } else {
                        System.out.println("不可");
                    }
                }
                int ma=max(score);
                System.out.println("最高点 "+ma);
                int mi=min(score);
                System.out.println("最低点 "+mi);
                double av=average(num,score);
                System.out.println("平均点 "+av);
            }
        private static int max(int score) {
            int ma=score[0];
            for(int i = 0; i < 5; i++){
                if(ma<score[i]){
                    ma=score[i];
                }
            }
            return ma;
        }
        private static int min(int score) {
            int mi=score[0];
            for(int i = 0; i < 5; i++){
                if(mi>score[i]){
                    mi=score[i];
                }
            }
            return mi;
        }
        private static double average(int num,int score[]) {
            double av=0.0;
                for(int i = 0; i < 5; i++){
                av=av+score[i];
                }
            }
            av=av/(double)number;
            return av;
        }
        //本来ならここに処理を書く
        //スラッシュを2つ打つと、コメント文として認識される。
        //コードの可読性の向上につながるので、書く癖をつけよう
    }
}
