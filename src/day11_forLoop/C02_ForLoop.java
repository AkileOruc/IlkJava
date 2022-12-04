package day11_forLoop;

import java.util.Locale;

public class C02_ForLoop {

// input olarak verilen bir Stringde

// index'i cift sayi olanlari buyuk harfle
// index'i tek sayi olanlari kucuk harfle yazdirin
// ornek : Java  output: JaVa

    public static void main(String[] args) {
        String input= "Java candir, Selenyum heyecandir";

        for (int i = 0; i <input.length() ; i++) {
            System.out.print(i%2==0                                    //index cift mi
                               ? input.substring(i,i+1).toUpperCase()  //ciftse buyuk harf
                                : input.substring(i,i+1).toLowerCase() // degilse kucuk harf  (Ternary yaptik)
                                 );
           // mesela i 0 ise o ile 1 arasi yani sifirinci karakter buyuk harf oldu
           // mesela i 2 ise 2 ile 3 arasi yani ikiinci karakter buyuk harf oldu
           // mesela i 4 ise 4 ile 5 arasi yani ucuncu karakter buyuk harf oldu

           // mesela i 1 ise 1 ile 2 arasi yani birinci karakter kucuk harf oldu
           // mesela i 3 ise 3 ile 4 arasi yani ucunncu karakter kucuk harf oldu
           // mesela i 5 ise 5 ile 6 arasi yani besinci karakter kucuk harf oldu....
           //


        }

    }


}
