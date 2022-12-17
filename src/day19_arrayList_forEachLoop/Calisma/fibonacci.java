package day19_arrayList_forEachLoop.Calisma;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void main(String[] args) {
        int sayi=10;

        List<Integer> fibo = new ArrayList<>();

        fibo.add(0);
        fibo.add(1);

        int birinci=0;
        int ikinci=1;
        int ucuncu=1;

        for (int i = 1; i <= sayi; i++) {
            ucuncu=ikinci+birinci;
           birinci= ikinci;
           ikinci=ucuncu;

           fibo.add(ucuncu);

        }
        System.out.println(fibo);
    }

}
