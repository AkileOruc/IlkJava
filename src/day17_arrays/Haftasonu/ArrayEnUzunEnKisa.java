package day17_arrays.Haftasonu;

import java.io.Console;
import java.util.Arrays;

public class ArrayEnUzunEnKisa {
    public static void main(String[] args) {
//Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method

        String[] arr = {"kutuphane", "kitap", "kalemtras", "kus","kalem","defter"};


        int enUzunIndex=0;
        int enKisaIndex=0;
        int maxKelimeSayisi=0;

        for (int i=0; i<arr.length; i++) {

            if (arr[i].length() > maxKelimeSayisi) {

                maxKelimeSayisi = arr[i].length();
                enKisaIndex = i;

            }
        }
        System.out.println("En uzun kelime:" + arr[enUzunIndex]);
    }
}


