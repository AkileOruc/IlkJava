package day20_Constructor.EkCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru28 {
    public static void main(String[] args) {
        /*Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
         Örnek:Sayı: 1238    Sayının Tersi: 8321    İpucu:  Loop kullanabilirsiniz.*/

       // int sayi =1238;
        int TersSayi=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int sayi= scan.nextInt();
do { TersSayi=TersSayi*10;
    TersSayi=TersSayi+sayi%10;
    sayi=sayi/10;

        }while (sayi!=0);

        System.out.println("Sayinin Tersi = " + TersSayi);

        }
    }

