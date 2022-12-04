package day08_StringManupulation;

public class C07_substring {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";
        System.out.println(str.length());     //19

        // metnin tam ortasindaki krk

        System.out.println(str.charAt(str.length()/2));  //n

       //son karakter

        System.out.println(str.charAt(str.length() - 1));   // p

        // verilen string in icerdigi bir metin parcasi mesela "ogren"

        System.out.println(str.substring(5, 9));    //   ogre


// substring(bas,bitis) method'unda
        // baslangic olarak yazilan index dahil(inclusive)
        // bitis olarak yazilan index haric(exclusive)'dir

        System.out.println(str.substring(5, 10)); // ogren



        // str dan "Java" kelimesini

        System.out.println(str.substring(0,4));

        //kap yazdiralim

        System.out.println(str.substring(16,19));
        System.out.println(str.substring(16));
        System.out.println(str.substring(str.length()-3));

        System.out.println(str.substring(0,1));

        //9. indeksteki harfi buyuk yazdir

        System.out.println(str.substring(9, 10).toUpperCase());    //N
        System.out.println(str.toUpperCase().charAt(9));    //N

        // chartAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz


        System.out.println(str.substring(5,5));   // hic bisey yazdirmaz  konsolda bos satir olusur

        System.out.println("=============");


        //   System.out.println(str.substring(4,3));    //   StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()-1));


        // System.out.println(str.substring(25,28)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length())); // hiclik yazdirir
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException
        System.out.println("=======");



    }
}
