package day15_scope_arrays.SoruCoz;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        /* while döngüsünü kullanarak verilen bir sayinin oncesinde  gelen  10 tane sayinin toplamini bulunuz,
        hem for hem while kullanarak yapabilir miyiz diye deneyelim*/


      /*  int sayi=50;
        int top=0;

        for (int i = sayi-1; i >sayi-11 ; i--) {
            top+=i;
            System.out.print(top +" ");    //49 97 144 190 235 279 322 364 405 445
        }*/


/*int sayi1=15;
  int toplam1=0;
      while (sayi1>15-10) {
   toplam1 += sayi1;
     sayi1--;
     }
   System.out.println(toplam1);*/

Scanner scan=new Scanner(System.in);
System.out.println("Bir sayi giriniz :");
int baslangicSayi= scan.nextInt();
int bitisSayi= baslangicSayi-10;
int toplam=0;
while (baslangicSayi>bitisSayi){
    toplam+=baslangicSayi-1;
    baslangicSayi--;
}
System.out.println("Girilen sayinin oncesinde gelen 10  sayinin toplami :"+toplam);
    }

}