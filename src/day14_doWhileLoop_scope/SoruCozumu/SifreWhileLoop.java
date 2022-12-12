package day14_doWhileLoop_scope.SoruCozumu;

import java.util.Scanner;

public class SifreWhileLoop {
    public static void main(String[] args) {
  /*Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesini isteyin
  Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
 sartlar :- sifrenin ilk karakteri kucuk harf olmali- sifre en az 8 karakter olmali -  sifrenin son karakteri sayi olmali
         */

        Scanner scan = new Scanner(System.in);
        boolean uygunSifre = false;
        String sifre = "";
        int bayrak = 0;
        while (uygunSifre != true) {        //sifre gecerli olmadigi muddetce yapilacak islem

            System.out.println("Lutfen sifreyi giriniz");
            sifre = scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("Sifrenin ilk harfi kucuk olmali");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) < '9')) {

                System.out.println("Sifrenin son karakteri sayi olmali");
                bayrak++;

            }
            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmali");
                bayrak++;
            }

            if (bayrak == 0) {
                uygunSifre = true;
                System.out.println("Sifre basari ile kaydedildi");
            }
        }

    }
    }

