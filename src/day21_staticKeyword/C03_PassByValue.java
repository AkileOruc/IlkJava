package day21_staticKeyword;

import java.util.Locale;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s= 20;
        System.out.println(s);      //20


       // int sayi=30;

       method1();                   // cagirdik ama yazdirmadik

        // int s= 30;
        // bir scope'da tanimlanan variable'in yeniden tanimlanma imkani yoktur
        // String s= "Hasan";
        // data turunun degistirerek yeniden tanimlamak da mumkun degildir
        // cunku kullanirken variable'in ismini yazdigimizda hangi sayi variable'ini kullanacagi mechul olur

    }
    public static void  method1(){
        method2(5);                        // 5*5= 25
        String s="Hasan";
        System.out.println(s.toLowerCase());     //hasan


    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
