package day18_arrayList.Calisma;

import day13_methodOverloading_whileLoop.ekCalisma.WhileLoop;

import java.util.ArrayList;
import java.util.List;

public class TerstenYaz {
    public static void main(String[] args) {
/*Verilen bir Array’i terse cevirip, bu halini liste halinde yazalim*/

        int[] arr= {2,4,6,8,1};
        List<Integer>TerstenYaz=new ArrayList<>();

        for (int i =arr.length-1 ; i >=0 ; i--) {

        TerstenYaz.add(arr[i]);


        }
        System.out.println("TerstenYazilisi = " + TerstenYaz);

    }
}
