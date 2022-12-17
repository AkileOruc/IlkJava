package day18_arrayList.Calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruFarkliElementler {
    public static void main(String[] args) {
// Verilen bir array'deki tekrar eden elementleri silip array'i unique degerlerden olusan array haline getirin

        String[]arr={"at","et","ot","ta","at","ot","et","kot","bot","at"};

        List<String>FarklilariSec=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

            if (!FarklilariSec.contains(arr[i]))
            FarklilariSec.add(arr[i]);

            }
            System.out.println(FarklilariSec);    // bu bir array list

        arr=new String[FarklilariSec.size()];       // farkli elementlerin eleman sayisi kadar yeni bir array

        for (int i = 0; i <FarklilariSec.size() ; i++) {

           arr[i]=FarklilariSec.get(i);

        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));

        }
    }

