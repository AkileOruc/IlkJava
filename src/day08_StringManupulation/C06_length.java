package day08_StringManupulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {


        String str= "Java her gecen gun daha da guzellesiyor";

        //sondan 3.karakter
        System.out.println(str.charAt(str.length()-3));


        System.out.println(str.length());

        //rastgele bir karakter

        Random rnd= new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur

        int index= rnd.nextInt(str.length());  // str.length() den kucuk rasgele harf verir
        System.out.println(str.charAt(index));
    }


}
