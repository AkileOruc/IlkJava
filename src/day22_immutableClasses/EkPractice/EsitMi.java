package day22_immutableClasses.EkPractice;

import java.util.Scanner;

public class EsitMi {

    public static void main(String[] args) {
        // float 2 sayinin esitligini karsilastiran bir kod yaziniz
        // birinci sayiyi kullanicidan alalim

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk float sayiniz");

        float sayi1= scan.nextFloat();
        System.out.println("sayi1 = " + sayi1);
        float sayi2= 1234f;
        System.out.println("sayi2 = " + sayi2);
        if (sayi1==sayi2){
            System.out.println("sayilar esit");
        }
        else
            System.out.println("Sayilar esit degil");
    }
}
