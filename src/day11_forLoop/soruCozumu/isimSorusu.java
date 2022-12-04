package day11_forLoop.soruCozumu;

public class isimSorusu {
    /*Kişi isimleri için 3 String değişken oluşturunuz.
    Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.

    Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.*/

    public static void main(String[] args) {



    String isim1= "Ali Can";
    String isim2= "Merve Star";
    String isim3= "Mark Tom";
    isim1=isim1.replace(" ","");
    isim2=isim2.replace(" ","");
    isim3=isim3.replace(" ","");
        System.out.println(isim1.length()+isim2.length()+isim3.length());



    }
    }









