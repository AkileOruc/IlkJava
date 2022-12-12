package day16_arrays.EkCalisma;

import java.util.Arrays;

public class arraysArtir {
    public static void main(String[] args) {

        String[] arr1 =new String[4];     //4elemani var dedik
        int[]arr2= {3,4,5,6,7,8};          // degerler atadik

        System.out.println(Arrays.toString(arr2));    //Stringe cevirdik yazdirdik
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");          //  bu sefer []  olmadan yazdirdik




            }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]+=5;                           //5'er artirdik     //[8, 9, 10, 11, 12, 13]     oldu


        }
        System.out.println("");

        System.out.println(Arrays.toString(arr2));
        //istenen bir sayiyi silip, yerine 0 yazdirin
  int silinecekSayi=10;

        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i]==silinecekSayi){
                arr2[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr2));    //[8, 9, 0, 11, 12, 13]
    }


    }
