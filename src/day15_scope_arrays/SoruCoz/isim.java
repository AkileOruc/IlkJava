package day15_scope_arrays.SoruCoz;

import java.util.Scanner;

public class isim {
    public static void main(String[] args) {
        // kullanici tamam diyene kadar konsola isim gondersin,ve bu kullanicinin gonderdigi isimleri
        // aralarinda yildiz olacak sekilde yazdirin,ama dikkat edin sonunda yildiz olmasin.
        // Bu soruyu while ile mi for ile mi cozmeliyiz dusunelim.


        Scanner scan = new Scanner(System.in);
        String kullaniciIsmi="";
        String isimToplami="";

        while (!kullaniciIsmi.equalsIgnoreCase("tamam")){

            System.out.println("Lutfen isim giriniz, bitirmek icin tamam'a basin");
            kullaniciIsmi=scan.nextLine();
            isimToplami+=kullaniciIsmi+"*";

        }
        System.out.println(isimToplami.substring(0,isimToplami.length()-7));  //tamam.length+  2 yildiz icin = 7
    }
}
