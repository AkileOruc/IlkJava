package day19_arrayList_forEachLoop.Calisma;

import java.util.Arrays;

public class catDog {
    public static void main(String[] args) {



    /*. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
    Ex:
    sentence = "caT dog dogG cAt"
    output:
            true*/


        String str = "caT dog dogG cAt";
        String cat="cat";
        String dog="dog";



        String [] aranan= str.split(" ");
        System.out.println(Arrays.toString(aranan));
        int countCat=0;
        int countDog=0;

        for (String each:aranan
        ) {
            if(each.equals(cat)){
                countCat++;
            }if (each.contains(dog)){
                countDog++;
        }

    }
        System.out.println(countCat +" "+ countDog);
}

}
