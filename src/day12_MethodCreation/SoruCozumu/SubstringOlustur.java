package day12_MethodCreation.SoruCozumu;

public class SubstringOlustur {
    public static void main(String[] args) {


    //Kullanicidan input olarak verilen bir String,
    //baslangic ve bitis indexlerine gore baslangic index'i dahil,
    // bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.-
    // kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

        String input= "Java cok guzel";
int basIndex= 5;
int bitisIndex=7;

SubstringMethodu(input,basIndex,bitisIndex);
        SubstringMethodu("Amande",1,3);

    }
    public static void SubstringMethodu(String input, int basIndex, int bitisIndex ){
if (basIndex>bitisIndex){
    System.out.println("Baslangic indexi bitis indexinden buyuk olamaz");
    
} else if (bitisIndex>=input.length()) {
    System.out.println("index Stringin disinda");

    
}else {
    //baslangic ve bitis indexlerine gore baslangic index'i dahil,
    // bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.-
    for (int i = basIndex; i <bitisIndex ; i++) {
        System.out.print(input.charAt(i));



    }

    }
    }
}
