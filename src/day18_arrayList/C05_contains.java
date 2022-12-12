package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {
        int[] arr= {7,5,2,3,6,7,4,8,5,2,4,2,4};

        List<Integer>sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.contains(10));
    }
}
