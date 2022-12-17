package day19_arrayList_forEachLoop.Calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AyniElementleriAlma {
    public static void main(String[] args) {
       // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        // tum elemanlardan  sadece 1 tane yapip  eski array’e yeni halini atayip yazdirin.


        Integer [] arr= {5,4,6,2,1,10,7,4,5,1,2,0};
        List<Integer>list=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
arr= new Integer[list.size()];
        for (int i = 0; i <arr.length ; i++) {
arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        }
    }

