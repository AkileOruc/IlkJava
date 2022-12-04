package day11_forLoop;

import java.util.Scanner;

public class C05_ForLoopSoru {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("bir baslangic ve bitis degeri giriniz");
        int baslangis = scan.nextInt();
        int bitis = scan.nextInt();

         if (bitis<baslangis){
             System.out.println("baslangic bitisten kucuk olmali");

         }else {
             int toplam=0;

        for (int i = baslangis; i <=bitis ; i++) {
            toplam +=i;
        }
            System.out.println(baslangis+"ile"+bitis+"arasindaki sayilarin toplami:"+toplam);


        }
    }
}
