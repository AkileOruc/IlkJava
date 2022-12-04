package day11_forLoop.soruCozumu;

public class ilkHarfSonHarf {
    public static void main(String[] args) {

//İlk ve son harfleri birlikte yazdıracak bir program yazın.

// Girdi: adobe
// Çıktı: ae

    String str= "adobe";
        System.out.print(str.charAt(0) );
        System.out.print(str.charAt(4));

        System.out.println("");


        System.out.println(str.charAt(0)+str.substring(4));
    }
}
