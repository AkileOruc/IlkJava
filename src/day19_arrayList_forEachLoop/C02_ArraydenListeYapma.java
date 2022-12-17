package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListeYapma {
    public static void main(String[] args) {

        Integer[] arr= {2,3,4,6,3,4,6,1,8,5,4};

         /*
            Verilen bir array'i list'e cevirmek icin 2 yontem vardir
            1- bir loop ile tum elementleri list'e kopyalamak
            2- asList() kullanmak
               cok tavsiye etmiyoruz, cunku 2 buyuk dezavantaji var
               - asList ile olusturulan list, array'den donusturuldugu icin
                 add, remove gibi size'i degistiren methodlar kullanilamaz
               - asList() ile olusturulan list ile bagli oldugu array
                 birbirinden ayrilmiyor
                 birinde yapacagimiz degisiklik, otomatik olarak digerini de etkiliyor
         */


        List<Integer>List1= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List1.add(arr[i]);

        }
        System.out.println("loop ila tasinan list: "+ List1);


        List<Integer>List2= Arrays.asList(arr);
        System.out.println("asList ile olusturulan list: " +List2);

      //  List2.add(6);    element eklettirmez hata verir

arr[0]=10;                                         // array in 0 inci elementini degistirdik
        System.out.println(Arrays.toString(arr));  //[10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]

        System.out.println(List2);   // [10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]         // list 2 de degisti

    }
}
