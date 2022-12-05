package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class IciceKelime {
    /*15-Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim 1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
    Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
    Örn:
    isim1= masa
            isim2= ali
    Konsol => maalisa                   */
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

        System.out.println(("Lutfen kelime giriniz"));
        String isim1 =scan .next();
        scan.nextLine();
        System.out.println("Lutfen ikinci bir kelime giriniz");
        String isim2=scan.next();
        if(isim1.length()%2==0){
        //substringle yapilis:
        System.out.println(isim1.substring(0, isim1.length() / 2) + isim2 + isim1.substring(isim1.length()/2));
        //replace ile yapilis
        System.out.println(isim1.replace(isim1.substring(isim1.length() / 2), isim2) + isim1.substring(isim1.length() / 2));
    }else{
        System.out.println("isim2 isim1 e eklenemez");
    }

    }


}
