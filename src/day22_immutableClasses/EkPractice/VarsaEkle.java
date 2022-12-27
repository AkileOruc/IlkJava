package day22_immutableClasses.EkPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VarsaEkle {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */
        public static void main(String[] args) {

            List<String> kullaniciIsimleri = new ArrayList<>();
            kullaniciIsimleri.add("Ali");
            kullaniciIsimleri.add("Veli");
            kullaniciIsimleri.add("Can");
            kullaniciIsimleri.add("Kivanc");
            System.out.println(kullaniciIsimleri);

            // 1. adım kullanicidan isim alma
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen kullanici ismi giriniz");
            String yeniIsim = scan.nextLine();

            // 2. adım alınan isimdeki boşluklar silindi
            yeniIsim = yeniIsim.replace(" ","");

            // girilen isim listede varsa sonuna sayı eklenip listeye ekleniyor, gösteriliyor
            if (kullaniciIsimleri.contains(yeniIsim)){
                System.out.println("Bu kullanici adi zaten var");
                int rasgeleSayi= new Random().nextInt(100);
                yeniIsim=yeniIsim+rasgeleSayi;
                kullaniciIsimleri.add(yeniIsim);
            }
            else{
                kullaniciIsimleri.add(yeniIsim);

            }
            System.out.println(kullaniciIsimleri);

    }
}
