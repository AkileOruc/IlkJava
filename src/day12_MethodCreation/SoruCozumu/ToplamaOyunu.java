package day12_MethodCreation.SoruCozumu;

import java.util.Scanner;

public class ToplamaOyunu {
    public static void main(String[] args) {
        /*Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu negatif sayiyi sayi adedine ve toplama eklemeyin  */


        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen toplamak icin tam sayilar girin,toplamayi bitirmek icin 0 a basin");
        int girilenSayi=1;
        int toplam=0;
        int sayiAdedi=0;


        while(girilenSayi!=0){
            girilenSayi=scan.nextInt();

           if (girilenSayi>=1){
               toplam=toplam+girilenSayi;
               sayiAdedi++;

           } else if (girilenSayi<0) {
               System.out.println("negatif sayi kullanamazsiniz");

           }

        }

        System.out.println("Toplam sonuc= "+ toplam + " toplamda " + sayiAdedi + " sayi girdiniz.");


    }
}
