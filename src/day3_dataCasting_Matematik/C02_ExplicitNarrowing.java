package day3_dataCasting_Matematik;

public class C02_ExplicitNarrowing {

     /*
           Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune
           casting yapmak isterseniz
           Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
           islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
           (donusturmek istedimiz data turu) yazilmalidir

           Explicit narrowing yapildiginda data kayiplari
           veya datanin beklenmedik bir sonuca donusmesi mumkundur
         */

    public static void main(String[] args) {
        /*
        String str= 23;
        int sayi="Merhaba Java";
        char ilkHarf=true;
         */
        short sayi2=45;
        int sayi3=sayi2;
        // int   = short  degerin kapasitesi variable'in kapasitesinden kucuk oldugundan sorun yok
        int sayi4=45;
        double sayi5=sayi4;
        // double  =  int degerin kapasitesi variable'in kapasitesinden kucuk oldugundan sorun yok
        double sayi6= 5;
        //int sayi7=sayi6;
        // int     = double   double olan deger'in kapasitesi, int olan variable'in kapasitesinden buyuk
        //                    java otomatik cevirme yapmaz
        int sayi8=99;
        //byte sayi9=sayi8;
    }
}




