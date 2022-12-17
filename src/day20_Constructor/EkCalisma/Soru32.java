package day20_Constructor.EkCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru32 {
    public static void main(String[] args) {
       //32-) Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    // İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...

        int [] arr={9,8,7,6,5,4,3,2,1,0};
        List<Integer>Ters=new ArrayList<>();

        for (int i = arr.length-1; i >=0 ; i--) {

         Ters.add(arr[i]);

        }
        System.out.println(Ters);
    }
}
