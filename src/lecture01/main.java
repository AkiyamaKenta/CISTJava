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
        public class Exercise01_5 {
            public static void main(String[] args) {
                int[] score = {41, 85, 72, 38, 80};
                for (int i = 0; i < score.length; i++) {
                    if (100 >= score[i] && score[i] >= 90) {
                        System.out.println(i + "番 " + score[i] + "点 秀");
                    }else if (90 > score[i] && score[i] >= 80) {
                        System.out.println(i + "番 " + score[i] + "点 優");
                    }else if (80 > score[i] && score[i] >= 70) {
                        System.out.println(i + "番 " + score[i] + "点 良");
                    }else if (70 > score[i] && score[i] >= 60) {
                        System.out.println(i + "番 " + score[i] + "点 可");
                    }else {
                        System.out.println(i + "番 " + score[i] + "点 不可");
                    }
                }
                System.out.println(".....");
                System.out.println("最高点:" + max(score) + "点");
                System.out.println("最低点:" + min(score) + "点");
                System.out.println("平均点:" + average(score) + "点");
                System.out.println(".....");
            }

            static int max(int[] score) {
                int maxScore = score[0];

                for (int i = 1; i < score.length; i++) {
                    if (maxScore < score[i]) maxScore = score[i];
                }
                return maxScore;
            }

            static int min(int[] score) {
                int minScore = score[0];

                for (int i = 1; i < score.length; i++) {
                    if (minScore > score[i]) minScore = score[i];
                }
                return minScore;
            }

            static double average(int[] score) {
                double ave;
                double sum = 0;

                for (int s : score) { // 拡張for文（score配列から要素を取り出し、変数sに格納。配列から要素を全て取り出すまで繰り返す。）
                    sum += s;
                }
                ave = sum / (double) score.length;
                return ave;
            }

        }
        //本来ならここに処理を書く
        //スラッシュを2つ打つと、コメント文として認識される。
        //コードの可読性の向上につながるので、書く癖をつけよう
    }
}
