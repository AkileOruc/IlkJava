package day17_arrays;

import java.util.Arrays;

public class C07_MDA {

    /*Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
    yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    input :     int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
    output:                      [10, 3, 12, 10, 9]       */

    public static void main(String[] args) {

        int[][] arr = {{3,1,5,4},{1,6},{6,4,5},{10},{7,7}};

        int[] toplamlarArrayi= new int[arr.length];      //       [0,0,0,0,0]
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
           toplam+= arr[i][j];
            }

            toplamlarArrayi[i]=toplam;     // topladiklarimi sifirladigim degerlere ekledim
            toplam=0;                     // toplamaya sifirdan baslasin diye toplam i sifirladik

        }
        System.out.println(Arrays.toString(toplamlarArrayi));
        }






    }
