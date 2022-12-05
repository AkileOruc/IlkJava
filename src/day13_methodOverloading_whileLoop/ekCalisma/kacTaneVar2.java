package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class kacTaneVar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Bir cumle giriniz");
            String cumle = scan.nextLine();
            System.out.println("Bir karakter giriniz");
            char chr = scan.next().charAt(0);

            int sayac = 0;

            int kacTane = cumle.length()-1;           // ismin son karakterine kadar arama yapacagiz


            while (kacTane >= 0) {                                         //aranan sey 0 degilse
                if (cumle.substring(kacTane,kacTane+1).charAt(0)==(chr)) {   //ilerle karakteri bulunca sepete 1 ekle
                    sayac++;
                }
                kacTane--;
            }
            System.out.println(cumle + " icerisinde " + sayac + " tane " + chr + " bulundurur.");

    }
}
