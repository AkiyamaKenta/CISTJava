package CIST2awJavaw5;

import java.util.Scanner;

public class kadai57 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TriangleFinder TF = new TriangleFinder();

        for (int i = 0; i<3; i++){
            TF.tf[i] = new Triangle();
            System.out.print("x = ");
            TF.tf[i].tate = input.nextFloat();
            System.out.print("y = ");
            TF.tf[i].yoko = input.nextFloat();
            System.out.print("z = ");
            TF.tf[i].takasa = input.nextFloat();
        }

        TF.maxmenseki();
        TF.maxtaiseki();
    }
}
