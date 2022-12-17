package day19_arrayList_forEachLoop.Calisma;

import day15_scope_arrays.SoruCoz.isim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitYapYazdir {
    public static void main(String[] args) {
        // Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
        //  yazdiriniz. ipucu: split()


        String cumle= "Kis uykusundan uyandi.";

        String [] chrac= cumle.split(""); // once split le cumleyi karakterlerine ayirdik

        for (String each : chrac   //arr ye git her bir int i bana getir
        ) {
            System.out.print(each+"/");    //gelen her bir elementi yazdir







        }


    }
}