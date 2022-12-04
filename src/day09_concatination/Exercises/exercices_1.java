package day09_concatination.Exercises;

import java.util.Scanner;

public class exercices_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi >= 0) {
            if (sayi < 10) System.out.println("Rakam");
            else System.out.println("iki basamaklı veya daha buyuk bir sayi");
        }else if (sayi < 0) System.out.println("Negatif Sayi");

        else System.out.println("yanliş giriş yaptınız lutfen bir sayi giriniz");
    }
}

