package day18_arrayList.Calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HarfYazdir {
    public static void main(String[] args) {
        //verilen baslangic ve sayilari dahil  aradaki tum sayilari yazdirin

        int baslangic = 1;
        int bitis = 20;
       int[] arr = new int[(bitis - baslangic)+1];

        List<Integer> Sayilar = new ArrayList<>();

        for (int i = 0; i <bitis ; i++) {
            arr[i]=i+1;
            Sayilar.add(i+1);
        }
    System.out.println(Arrays.toString(arr));
        System.out.println("Sayilar = " + Sayilar);        }
        }

/* int b=4;
    int s=16;
    List<Integer> sayi= new ArrayList<>();
        for (int i = b; i <= s; i++) {
            sayi.add(i);
        }
        System.out.println(sayi);
    }*/
