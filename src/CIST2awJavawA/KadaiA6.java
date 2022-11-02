package CIST2awJavawA;

import java.util.List;
import java.io.IOException;

public class KadaiA6 {
    public static void main(String[] args) {

        try {
            FileManager fileManager = new FileManager("students.txt");
            List<String> lines = fileManager.getAsList();

            for (String au: lines) {  //auを書き換え
                Student ai = new Student(au);
                ai.print();
            }

        } catch (IllegalArgumentException e1) {
            System.out.println("ファイル名を正しく入れてください");
        } catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }

        System.out.println("終了");
    }

}