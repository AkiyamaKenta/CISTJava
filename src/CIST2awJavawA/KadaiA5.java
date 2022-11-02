package CIST2awJavawA;

import java.io.IOException;

public class KadaiA5 {
    public static void main(String[] args) {

        try {
            FileManager fileManager = new FileManager("students.txt");  //インスタンス化
            String[] lines = fileManager.getAsArray();  //メソッド実行

            for (String au: lines) {
                Student student = new Student(au);
                student.print();
            }

        } catch (IllegalArgumentException e1) {
            System.out.println("ファイル名を正しく入れてください");
        } catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }

        System.out.println("終了");
    }

}