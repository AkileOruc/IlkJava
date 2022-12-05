package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class IsimKopya {
    public static void main(String[] args) {
        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
         Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
         Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
         Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
         Loopun içerisinde String methodlarından  yararlanalım!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen en az 5 harfli bir kelime giriniz");

        String kelime= scan.nextLine();
        String yeniKelime="";
boolean besHarfli= true;
while (besHarfli)

if(kelime.length()>=5){
    yeniKelime+=kelime.substring(kelime.length()-3).repeat(2);
    System.out.println(yeniKelime);

besHarfli=false;

    }else{
    System.out.println("Girdiginiz kelime "+ kelime.length()+"harflidir. Lutfen en az 5 harfli yeni kelime girin");

}
    }

}