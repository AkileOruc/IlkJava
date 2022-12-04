package day13_methodOverloading_whileLoop.ekCalisma;


import java.util.Scanner;

public class isimSoyisim {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("**************String Manupulations ile******************");

        System.out.println("isim:"+isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1));
        System.out.println("Soyisim:"+soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1));

        System.out.println("**********************Method ile***********************");
        System.out.println(isimSoyisim(isim, soyIsim));
    }
            // once main methodun disina cikalim

    public static String isimSoyisim(String isim,String soyIsim){
        return isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1)+" "+
                soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1);

    }

}