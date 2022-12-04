package day09_concatination;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

// cumledeki cok ile baslayan ilk kelime
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String girilenCumle=scan.nextLine();

        // Sinavlarimizda coktan secmeli sorular kullaniyoruz
        //Javayi cok seviyoruz
        //Bu kadar coklu secenek olur mu?

        if (!girilenCumle.contains("cok")) {

            System.out.println("cumlede cok ile baslayan kelime yok");

        } else {
            int cokIndex= girilenCumle.indexOf("cok");
            int boslukIndex= girilenCumle.indexOf(" ",cokIndex+1);

            System.out.println(girilenCumle.substring(cokIndex, boslukIndex));

        }


    }
}
