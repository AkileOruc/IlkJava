package day11_forLoop.soruCozumu;

import java.util.Scanner;

public class caySorusu {
    public static void main(String[] args) {
        /*Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın

        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Gunde kac bardak cay icersiniz?");
        int cay= scan.nextInt();

        System.out.println("Kac seker atarsiniz?");
        int seker= scan.nextInt();

       double sonucCay= 365*5;
       double sonucSeker= cay*seker*1.5*365/1000;

        System.out.println("yillik seker tuketiminiz: "+sonucCay+"  yillik seker tuketiminiz: " +sonucSeker+"kg");





    }
}
