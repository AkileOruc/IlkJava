package day19_arrayList_forEachLoop.Calisma;

import java.util.Arrays;
import java.util.Scanner;

public class HarfVarMI {

    public static void main(String[] args) {
      //  Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
      //  kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

     String cumle="Ablasi kardesine kitap okuyordu";

     String harf= "a";

        //once bu String cumleyi Array e cevirelim ve parcalara ayiralim

        String [] cumleninArrsi= cumle.split("");
        System.out.println(Arrays.toString(cumleninArrsi));

        //kac kere kullanilmis dedigi icin sayac kullanicaz

        int sayac=0;
        for (String each:cumleninArrsi
             ) {
            if (each.contains(harf))
            sayac++;
        }

        if (sayac==0){
            System.out.println("harf kullanilmamis");
        }else {
            System.out.println(harf+ "  harfi cumlede "+ sayac+ " defa kullanilmis");
        }
        

    }
}
