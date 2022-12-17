package day18_arrayList.Calisma;

import java.util.Arrays;

public class ArrayeYeniIKelimelerEkle {

    public static void main(String[] args) {
        String[] arr1 ={"Pantalon","Kazak","Mont","Hirka"};
        String[] arr2 ={"Ayakkabi","Bot","Cizme"};
        //Iki array i birbirine ekleyelim
        
        String[] yeniArr= new String[(arr1.length)+(arr2.length)];
        for (int i = 0; i < arr1.length ; i++) {
            yeniArr[i]=arr1[i];

            yeniArr[yeniArr.length-3] =arr2[0];
            yeniArr[yeniArr.length-2] =arr2[1];
            yeniArr[yeniArr.length-1] =arr2[2];

        }
        System.out.println(Arrays.toString(yeniArr));

       
        
        
    }
    
    
}
