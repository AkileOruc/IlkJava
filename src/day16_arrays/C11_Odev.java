package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {

    static String[] isimler = {"Ali", "Veli", "Cem"};


    public static void main(String[] args) {
        // Kullanıcıdan yeni isimler alıp, var olan bir array'e ekleyen bir method oluşturun.
        // Kullanici yeni deger verdigi muddetce C10'daki hazir method'u kullanarak eklemeye devam edin
// Kullanici Q'ya bastiginda, array'in son halini döndürün
        Scanner scan = new Scanner(System.in);


        String YeniIsim = "";
        String[] isimler = {"Ayse", "Selin", "Canan"};
        String dur = "Q";
        while (!YeniIsim.toUpperCase().equals(dur)) {
            System.out.println("Lutfen listeye eklemek uzere isimler girin,bitirmek icin Q a basin");
            YeniIsim = scan.nextLine();
            isimler = C10_ArrayeBirElementEkleme.arrayeElementEkleme(isimler, YeniIsim);
        }
        System.out.println(Arrays.toString(isimler));

    }
}