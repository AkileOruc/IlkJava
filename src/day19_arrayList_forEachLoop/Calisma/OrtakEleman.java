package day19_arrayList_forEachLoop.Calisma;

import java.util.ArrayList;
import java.util.List;

public class OrtakEleman {
    public static void main(String[] args) {



    //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
    //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
   // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz


    String []arr1={"a","b","c","k" };
    String []arr2={"t","b","a","k" };

        List<String> ortakElementler= new ArrayList<>();  //Sepet olusturmak yerine bir ArrayList olusturuyoruz

        for (String each1:arr1  ) {
        for (String each2:arr2  ) {
           // ortakElementler.add(eachArr1);

            if (each2==each1) {
                if (!ortakElementler.contains(each1)) {
                    ortakElementler.add(each1);

                }
            }
        }
        }
        System.out.println("ortakElementler = " + ortakElementler);
    }
}