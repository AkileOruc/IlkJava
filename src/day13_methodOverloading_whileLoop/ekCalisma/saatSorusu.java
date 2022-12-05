package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class saatSorusu {
    public static void main(String[] args) {

        System.out.println("Lutfen  saat in kac oldugunu giriniz . ");
        Scanner scan= new Scanner(System.in);
        int saat=scan.nextInt();

        System.out.println("Lutfen dakikayi giriniz ");
        int dakika=scan.nextInt();

        System.out.println("Lutfen saniyeyi giriniz ");
        int saniye= scan.nextInt();

        int saniyeToplam=(saat*60*60)+(dakika*60)+saniye;

        System.out.println("Giridiginiz degerlerin saniye cinsinden degeri : "+ saniyeToplam);

    }
}
