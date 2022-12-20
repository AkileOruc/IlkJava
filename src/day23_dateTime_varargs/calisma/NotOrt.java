package day23_dateTime_varargs.calisma;

import java.util.Arrays;

public class NotOrt {
    public static void main(String[] args) {

        int[] notlar = {50,45,74,36,93,25,34,29};

        System.out.println("Notlar: "+ Arrays.toString(notlar));
        System.out.println("Not Ortalamasi: "+ortalama(notlar));

    }

    public static double ortalama(int[] notlar) {
        int ortalama = 0;
        for (int i = 0; i < notlar.length; i++) {
            ortalama = ortalama + notlar[i];
        }
        ortalama = ortalama / notlar.length;
        return (double) ortalama;
    }
    }