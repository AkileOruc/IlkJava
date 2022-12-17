package day20_Constructor.EkCalisma;

import day15_scope_arrays.SoruCoz.isim;

import java.util.Arrays;

public class Soru35 {
    public static void main(String[] args) {
 /* 35-) Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
 --> toCharArray() yöntemini kullanmayın
 Örnek:
 String isim:    Yakup
 char arr[]:     [Y,a,k,u,p]
 İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
 Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin*/
        String isim = "Yakup";

        char[] arr =isimChar(isim);
        System.out.println(Arrays.toString(arr));
    }
    public static char[] isimChar(String isim){
        char[] arr = new char[isim.length()];     //isim uzunlugunda bir char array
        for (int i = 0; i <isim.length(); i++) {
            arr[i] = isim.charAt(i);               // ismin harflerini array e ekledik
        }
        return arr;
       
    }

    }
