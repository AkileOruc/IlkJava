package day22_immutableClasses.EkPractice;

import java.util.Scanner;

public class MutlakDeger {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alip mutlak degerini bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();

        if(sayi<0){
            System.out.println(sayi*-1);
        }else System.out.println(sayi);


    }
}
