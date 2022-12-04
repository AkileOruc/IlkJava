package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class boleniniBulma {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        bolenleri sayisini bulup bize donduren bir method olusturun
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi1= scan.nextInt();


        System.out.println(bolenleriniBul(sayi1));
    }

    public static int bolenleriniBul(int sayi2){
        int count=0;


        for (int i = 1; i <=sayi2 ; i++) {
            if (sayi2%i == 0) {
               count++;
            }
            } return count;

            }


    }

