package day16_arrays.EkCalisma;

public class arrays1Toplama {
    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayalim

        int[] sayilar = {3, 7, 1, 9, -3, -11, -50};

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > 0) {
                toplam += sayilar[i];

            }

        }
        System.out.println(toplam);
        //Bir marketin fiyatlarini tutan bir array var
        // Bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun

        double[] fiyatListesi= {5.6,9.9,5.5,7.5,10.4,55.2};

        //once 1. veriden baslariz o da sifirinci index

        double enDusukFiyat=fiyatListesi[0];
        double enYuksekFiyat=fiyatListesi[0];
        for (int i = 0; i <fiyatListesi.length ; i++) {

            if (fiyatListesi[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatListesi[i];
            }
        }
        System.out.println("enDusukFiyat: "+ enDusukFiyat);
        System.out.println("enYuksekFiyat: "+enYuksekFiyat);
    }
}
