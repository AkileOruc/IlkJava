package day17_arrays.Haftasonu;

import java.util.Arrays;

public class Soru1 {
    //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.
    public static void main(String[] args) {
        int[] arr= {9,6,3,7,4,1,0};

        ikiArtirYazdir (arr );

        }

public static int ikiArtirYazdir(int []arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] += 2;


    }
    int yeniArr = 0;

    System.out.println(Arrays.toString(arr));

    return yeniArr;
}


}

