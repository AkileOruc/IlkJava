package day11_forLoop.soruCozumu;

public class tekrarCarpimTablosu {

    public static void main(String[] args) {

        //  1 2 3 4
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");

        }
        System.out.println("");

        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");


        }
        System.out.println("");


        for (int i = 1; i <= 4; i++) {
            System.out.print(4 * i + " ");

        }
        System.out.println("");


        System.out.println("******************NESTED LOOP ILE***************************");
        for (int i = 1; i <=4 ; i++) {       //satir

            for (int j = 1; j <=4; j++) {    //sutun

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }





    }






}
