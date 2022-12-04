package day05_ifStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {
        /*
        kullanicidan bir ucgenin 3kenar uzunlugunu alin
        eskenarsa "eskenar ucgen"  yazdirin
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin 3kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2  && kenar2==kenar3  && kenar1>0)
            System.out.println("eskenar ucgen");

    }



}
