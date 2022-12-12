package day17_arrays.Haftasonu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
    public static <arr> void main(String[] args) {

        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method
        int i = 0;
       int arr[] = new int [5];
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < arr.length; i++) {
            System.out.println("sayilarin  " + (i+0)+ ". index degerini giriniz");

            arr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.print(Arrays.toString(arr));

    }
        }



