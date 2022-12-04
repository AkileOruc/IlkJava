package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

/*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir ondalik sayi girin");

        double sayi1= scan.nextDouble();
        System.out.println("Lutfen bir tam sayi girin");

        int sayi2 = scan.nextInt();

        System.out.println("sayilarin toplami:"+ (sayi1+sayi2));

        System.out.println("sayilarin carpimi:"+ sayi1*sayi2);
        }


    }



