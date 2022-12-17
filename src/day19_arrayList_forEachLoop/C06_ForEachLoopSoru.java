package day19_arrayList_forEachLoop;

import java.util.Arrays;

public class C06_ForEachLoopSoru {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle ="Java ogrenmek cok guzel";
        String harf= "a";

        String[]cumleArr= cumle.split(""); //  once bunu bir arraya cevirelim
        System.out.println(Arrays.toString(cumleArr)); //bakmak icin yazdirdik

        int sayac=0;
        for (String eachHarf:cumleArr
             ) {
            if (eachHarf.equals(harf)){
                sayac++;
            }
        }
if (sayac==0){
    System.out.println("harf kullanilmamis");
}else {
    System.out.println(harf+ "  harfi cumlede "+ sayac+ " defa kullanilmis");
}
    }
}
