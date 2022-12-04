package day10_stringManipulations.EkCalisma;

import java.util.Scanner;

public class HarfVarmi {

    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir harf giriniz ");
        String harf= scan.nextLine();

       if (cumle.contains(harf)){
           System.out.println(harf+" harfi girdiginiz cumlede var");
       } else
           System.out.println(harf+"  harfi girdiginiz cumlede yok");



    }

}





