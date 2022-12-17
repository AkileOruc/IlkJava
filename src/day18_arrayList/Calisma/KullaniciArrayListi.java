package day18_arrayList.Calisma;

import day15_scope_arrays.SoruCoz.isim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullaniciArrayListi {
    public static void main(String[] args) {

//Kullanicidan istedigi kadar harf alip,X'e bastiginda harfleri  liste olarak yazdirin


        char GirilenHarf=' ';
        List<String> HarfListesi= new ArrayList<>();
        Scanner scan =new Scanner(System.in);

        while (!(GirilenHarf =='x')){
          System.out.println("Lutfen bir harf giriniz ");
          GirilenHarf= scan.next().charAt(0);
          if (!(GirilenHarf =='x'))
              HarfListesi.add(String.valueOf(GirilenHarf));
        }
        System.out.print("harfler = " + HarfListesi);
        }
    }

    /*String GirilenHarf="";
    List<String> HarfListesi= new ArrayList<>();
    Scanner scan =new Scanner(System.in);
        while (!(GirilenHarf.equals("x"))){
                System.out.println("Lutfen bir harf giriniz ");
                GirilenHarf= scan.next();
                if (!(GirilenHarf.equals("x")))
                HarfListesi.add(GirilenHarf);
                }
                System.out.print("harfler = " + HarfListesi);*/
