package day17_arrays.Haftasonu;

import java.util.Scanner;

public class practiceSoru1 {
    public static void main(String[] args) {
 // 1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen metninizi giriniz ");

        String str= scan.nextLine();

        String yeniStr=str.replaceAll("\\D"," ");
        System.out.println("yeniStr = " + yeniStr);

        int toplam=0;
        for (int i = 1; i <=yeniStr.length(); i++) {

            toplam+=i;
        }

        System.out.println("toplam = " + toplam);

//kitabin 254.sayfasinin 24.satirinin 7.kelimasi nedir

    }
}
