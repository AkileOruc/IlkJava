package day17_arrays.Haftasonu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner2 {
    public static void main(String[] args) {
//Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

            System.out.println(Arrays.toString(ArrayOlusturma()));

}
public static String[] ArrayOlusturma(){

    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen array uzunlugunu giriniz");
    int ArrayUzunlugu= scan.nextInt();
    scan.nextLine();

    String[]kullaniciArrayi=new String[ArrayUzunlugu];

    System.out.println("Lutfen arrayin elementlerini giriniz");

    for (int i = 0; i <ArrayUzunlugu ; i++) {

        String elementler =scan.nextLine();

        kullaniciArrayi[i]= elementler ;
    }
    return kullaniciArrayi;
}
        }
