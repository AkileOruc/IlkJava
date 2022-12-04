package day11_forLoop.soruCozumu;

import java.text.DecimalFormat;

public class stringeCevirme {
    public static void main(String[] args) {

// Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
//            input1 : "15.30 €" , input2 : "11.40 €"
//            output : 26.70 €

        System.out.println("************************Replace ile cozumu*********************");


        String s1="15.30 €";
        String s2="11.40 €";
        String yeniS1=s1.replace("€","").trim();
        String yeniS2=s2.replace("€","").trim();
        System.out.println(Double.parseDouble(yeniS1) + Double.parseDouble(yeniS2));



        System.out.println("************************Substring ile cozumu*********************");


        String input1 = "15.30 €";
        String input2 = "11.40 €";

        String tamSayi1= (input1.substring(0, 2));
        int tamSayi1Int= Integer.parseInt(tamSayi1); //15
        String ondalik1= (input1.substring(3,5));
        int ondalik1Int= Integer.parseInt(ondalik1);  //30
        String tamSayi2= (input2.substring(0, 2));
        int tanSayi2Int= Integer.parseInt(tamSayi2);   //11
        String ondalik2= (input2.substring(3,5));
        int ondalik2Int= Integer.parseInt(ondalik2);  //40

        int outputTam= (tamSayi1Int+tanSayi2Int);
        int outputOndalik= (ondalik1Int+ondalik2Int);

        String nokta=input1.substring(2,3);
        String euro= input1.substring(5,7);
        System.out.println("output : "+ outputTam + nokta + outputOndalik + euro);

        System.out.println("*********************kisa cozum************************");

        String inputa= "15.30 £";
        String inputb= "11.40 £";
        double sayi1 = Double.parseDouble(input1.substring(0,input1.length()-1));
        double sayi2 = Double.parseDouble(input2.substring(0,input2.length()-1));
        char birim = input1.charAt(input1.length()-1);
        System.out.println(new DecimalFormat("##.##").format(sayi1+sayi2)+" "+birim);



}


}
