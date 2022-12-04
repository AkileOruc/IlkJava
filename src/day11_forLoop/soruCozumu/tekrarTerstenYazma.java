package day11_forLoop.soruCozumu;

public class tekrarTerstenYazma {
    public static void main(String[] args) {

        String str="Calismak gerek";
        String tersten="";

        for (int i = str.length()-1; i >=0 ; i--) {      //son harften basla 0 a kadar geri geri 1erli

            tersten+=str.substring(i,i+1);     //i inci indexteki harfi bulmak icin
            }
        System.out.println("tersten yazilis:  " + tersten);
        }





    }


