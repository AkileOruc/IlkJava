package day14_doWhileLoop_scope.SoruCozumu;

import java.util.Scanner;

public class grupCal {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan= new Scanner(System.in);
      int Kullanicisayisi=0;

      int top=0;


       do {
           System.out.println("Lutfen toplanamak uzere sayilar girin");
           int girilenSayi= scan.nextInt();
           top+=Kullanicisayisi;
       }

       while (Kullanicisayisi!=0);

        System.out.println(top);

    }
}
