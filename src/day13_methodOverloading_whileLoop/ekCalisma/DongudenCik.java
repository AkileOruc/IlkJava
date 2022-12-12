package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class DongudenCik {
    public static void main(String[] args) {
        //Girilen bir String deki a harfi sayisini bulun ama c harfine gelince donguden cikilsin


        System.out.println("Bir cumle giriniz");
        Scanner scan= new Scanner(System.in);
        String str= scan.nextLine().toUpperCase();
int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='A'){
                sayac++;
            }
if (str.charAt(i)=='C'){
    break;
}
        }
        System.out.println("c den onceki a harfi sayisi = " + sayac);





    }
}
