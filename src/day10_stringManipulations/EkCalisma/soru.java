package day10_stringManipulations.EkCalisma;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
       // Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
        //cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
        //yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen icinde kucuk veya buyuk kelimesi gecen bir cumle giriniz ");

        String cumle= scan.nextLine();


        if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        }else
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


    }
}
