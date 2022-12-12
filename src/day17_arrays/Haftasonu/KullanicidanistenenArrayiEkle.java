package day17_arrays.Haftasonu;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanistenenArrayiEkle {
    public static void main(String[] args) {
// Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,eski array’e yeni degeri atayin.

        System.out.println(Arrays.toString(isteEkle()));

    }public static int[] isteEkle() {

        int[] arr = {1, 2, 3, 4, 5};

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yeni sayi giriniz");

       int yeniSayi = scan.nextInt();

        int[] arr1 = new int[arr.length + 1];

        for (int i = 0; i < arr.length ; i++) {
            arr1[i]=arr[i];

            arr1[arr1.length-1] = yeniSayi;

    }
        return arr1;
    }}