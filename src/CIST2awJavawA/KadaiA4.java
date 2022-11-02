package CIST2awJavawA;

import java.io.IOException;

public class KadaiA4 {
    public static void main(String[] args) {

        try {
            FileManager fileManager = new FileManager("messages.txt");  //インスタンス化
            String[] lines = fileManager.getAsArray(); //getAsArrayメソッドを実行

            for(int i = 0;i<lines.length;i++){
                System.out.println(lines[i]);
            }

        } catch (IllegalArgumentException e1) {
            System.out.println("ファイル名を正しく入れてください");
        } catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }
        System.out.println("終了");
    }
}