package day23_tatili;

import java.sql.Array;
import java.util.Arrays;

public class Soru41 {
    public static void main(String[] args) {
/* Soru 41-)Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve
 yazdıran bir method yazın.
 Input1={1,2,3,4}
 Input2={5,6}
 Çıktı={1,2,3,4,5,6}*/
        int [] input1={1,2,3,4};
        int [] input2={5,6};
        hepsiniEkle(input1,input2);

    }

    private static void hepsiniEkle(int[] input1, int[] input2) {
        int[] hepsi = new int[input1.length + input2.length];

        for (int i = 0; i < input1.length; i++) {
              hepsi[i]=input1[i];
        }
        for (int j = 0; j < input2.length; j++) {
            hepsi[input1.length + j] = input2[j];
        }
        System.out.println(Arrays.toString(hepsi));
    }}