package day12_MethodCreation.SoruCozumu;

public class TersCevirmeMetoduOlustur {
    public static void main(String[] args) {
        // verilen iki String'i parametre olarak kabul edip
        // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
        // main method'a donduren bir method olusturun

        String input= "Java kod yazdikca ogrenilir";

        System.out.println(terstenYazma(input));

    }
public static String terstenYazma(String input){
    String yeniImput="";
    for (int i = input.length()-1; i >=0 ; i--) {


        yeniImput=yeniImput+input.charAt(i);

    }
    return yeniImput;

    }
}
