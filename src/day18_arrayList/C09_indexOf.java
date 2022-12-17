package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_indexOf {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); // [A, Z, T]

        System.out.println(harfler.indexOf("Z")); // 1

        System.out.println(harfler.lastIndexOf("Z")); // 1    //sondan saymaya baslar

        harfler.add("Z");
        System.out.println(harfler); // [A, Z, T, Z]             //sona ekleme yapar

        System.out.println(harfler.indexOf("Z")); // 1           //bastan saydi

        System.out.println(harfler.lastIndexOf("Z")); // 3     // sondan saydi

        System.out.println(harfler.indexOf("M")); // -1
        System.out.println(harfler.lastIndexOf("M")); // -1


    }
}