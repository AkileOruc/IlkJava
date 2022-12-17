package day18_arrayList.Calisma;

import java.util.ArrayList;
import java.util.List;

public class ArrayListeEkle {

    public static void main(String[] args) {
       String [] arr1 ={"Pantalon","Kazak","Mont","Hirka"};
        String[] arr2 ={"Ayakkabi","Bot","Cizme"};
        
        List <String> Liste= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            Liste.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            Liste.add(arr2[i]);

        }
        System.out.println("Liste = " + Liste);
    }
}
