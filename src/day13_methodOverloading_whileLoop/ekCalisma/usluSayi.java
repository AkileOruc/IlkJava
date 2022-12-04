package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        //Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop kullanarak
        // verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun

        Scanner scan = new Scanner(System.in);

        System.out.println("Ussunu hesaplamak istediginiz sayiyi giriniz :");
        int taban = scan.nextInt();

        System.out.println(taban + " ussu kaci hesaplamak istersiniz+:");
        int us = scan.nextInt();

ussunuBul(taban,us);
        }



    public static void ussunuBul(int taban,int us){
        System.out.println(taban + "^" +us );
        long sonuc = 1;
        while (us >= 0) {

            sonuc *= taban;
            us--;
        }
            System.out.println("SONUC="+sonuc);



}

}