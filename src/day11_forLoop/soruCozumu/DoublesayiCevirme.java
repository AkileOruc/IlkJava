package day11_forLoop.soruCozumu;

import java.util.Scanner;

public class DoublesayiCevirme {
    public static void main(String[] args) {
       /* Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim*/


        Scanner scan= new Scanner(System.in);
        System.out.println("Double sayi giriniz : ");
        double sayi= scan.nextDouble();
        System.out.println("Double sayinin int hali : "+(int)sayi);


    }
}
