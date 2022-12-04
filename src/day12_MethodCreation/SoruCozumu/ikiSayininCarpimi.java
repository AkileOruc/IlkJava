package day12_MethodCreation.SoruCozumu;

import day12_MethodCreation.C02_MethodOlusturma;
import day12_MethodCreation.C04_Faktoryel;
import day12_MethodCreation.C07_TerseCevirme;

public class ikiSayininCarpimi {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        C02_MethodOlusturma.carpYazdir(a,b);

        String c= "Cok";
        String d= "Guzel";
        System.out.println(C07_TerseCevirme.metniTerseCevir(c+d));


    }
}
