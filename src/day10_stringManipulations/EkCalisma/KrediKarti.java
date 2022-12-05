package day10_stringManipulations.EkCalisma;

import java.util.Scanner;

public class KrediKarti {
    public static void main(String[] args) {
       /* Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234                                   */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz ");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz ");
        String soyIs= scan.nextLine();

        System.out.println("Lutfen 16 haneli kredi karti bilgilerinizi giriniz ");
        String kartNo =scan.nextLine();
        int flag=0;
        if (!(kartNo.length()==16)){
            System.out.println("Kart numarasi 16 haneli olmali");
            flag++;
        }if (flag==0){
            System.out.println(isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w","*"));
            System.out.println(soyIs.toUpperCase().charAt(0) + soyIs.substring(1).replaceAll("\\w", "*"));

            System.out.print("**** **** **** " + kartNo.substring(12));






        }

    }
}
