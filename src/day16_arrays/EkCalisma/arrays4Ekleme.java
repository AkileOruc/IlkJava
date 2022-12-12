package day16_arrays.EkCalisma;

import java.util.Arrays;

public class arrays4Ekleme {
    public static void main(String[] args) {
        int[] arr1= {6,8,3};
        System.out.println(Arrays.toString(arr1));         //     [6, 8, 3]

        int[] temp =new  int[5];                // bi sureligine 5 veri yaptik
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];                    // arr 1 in degerlerini bi sureligine temp e aktardik
        }
        System.out.println(Arrays.toString(temp));   //[6, 8, 3, 0, 0]
        arr1=temp;
        System.out.println(Arrays.toString(arr1));     //[6, 8, 3, 0, 0]      //geri aldik
    }
}
