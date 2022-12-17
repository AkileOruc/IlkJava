package day19_arrayList_forEachLoop.Calisma;

import java.util.ArrayList;
import java.util.List;

public class KaresiToplami {
    public static void main(String[] args) {
        //Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
       // loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        Integer[] arr= {2,1,5,4};

        List<Integer>list1= new ArrayList<>();
        int toplam=0;
        for (Integer each :arr) {

         toplam+=each*each;

        }
        System.out.print(toplam);



    }
}
