package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        // java'da bir cok yapida get ve set method'lari bulunur
        // get method'lari bilgiyi bize getirirken
        // set method'lari bilgiyi update eder

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);

        // 2.index'e F elemanini ekleyin
        // add method'u var olan listeden herhangi bir elementi degistirmeden
        // istedigimiz elementi ekler, kalanlari kaydirir

        harfler.add(2,"F");     // add  2.siraya F koyar digerleri 1er kayar
        System.out.println(harfler);

        harfler.set(2,"M");
        System.out.println(harfler);       // set ise 2 deki elemani silip yerine M koyar


        // set method'u var olan elemntin degerini gunceller
        // eleman sayisini artirmaz

    }
}
