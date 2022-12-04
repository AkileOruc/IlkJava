package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class WhileLoop2 {
    /*While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.*/
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz :");
        int sayi = scan.nextInt();
        int rakam=0;
        int toplam = 0;
        while(sayi > 0) {
            toplam += sayi % 10;
            sayi /=10;
        }
        System.out.println("Sayidaki rakamlarin toplami :"+  toplam);
     /* int sayi =123;                                      //BENIM YAPTIGIM
        int rakam=0;
        int toplam = 0;


        while(sayi > 0) {
            rakam = sayi % 10;
            toplam = toplam + rakam;
            sayi = sayi / 10;
        }
        System.out.println("Sayidaki rakamlarin toplami :"+  toplam);


        }  */







}

}
