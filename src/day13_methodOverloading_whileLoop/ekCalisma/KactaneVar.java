package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class KactaneVar {
    public static void main(String[] args) {

    /*Soru 17-) Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
     ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim
     ******Örnek******
    char ch1=            'a'
    String name =     "Ali bakkala geç gitti."
    Beklenen Çıktı=    a sayısı = 3
    *****ipucu*****Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
    Sayac adlı bir int variable oluşturarak bununla kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.next().toLowerCase();
        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scan.next().toLowerCase().charAt(0);

        int sayac=0;
        for (int i = 0; i <isim.length() ; i++) {
            if(isim.charAt(i)==karakter)
                sayac++;
        }
        System.out.println("Karakterimiz kelimenin icinde " + sayac + " kez gecmektedir");
    }
}

/*  Scanner scan=new Scanner(System.in);                                    While Loop ile

        System.out.print("Lütfen bir isim giriniz: ");
        String isim=scan.nextLine();

        System.out.print("Lütfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);

        int sayac=0;
        int index=0;
        while(index<isim.length()){
            if (karakter==isim.charAt(index)) {
                sayac++;
            }
            index++;
        }
        System.out.println("Cümlede "+karakter +" "+ sayac+" adet var.");
    }











    */

