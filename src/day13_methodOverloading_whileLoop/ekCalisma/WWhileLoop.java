package day13_methodOverloading_whileLoop.ekCalisma;

import day12_MethodCreation.C07_TerseCevirme;

public class WWhileLoop {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize donduren bir method olusturun.

        String str = "Her sey yolunda";
        System.out.println(cevir(str));
    }public static String cevir(String str){
        String yeni="";
        int length= str.length()-1;
        while(length>=0){
            yeni+=str.charAt(length);
            length--;
        }return yeni;
    }




        }
