package day12_MethodCreation;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        //verilen 2 sayiyi carp sonucu yazdir
carpYazdir(5,8);                                    // metodu main mothodun disinda yaptik,main in icinde geri cagirdik
carpYazdir(7.4,8.6);                                // method call icerisinde yazilan degerlere argument denir
                                                    // icine uyumsuz argument yazarsak CTE olur
    }
   public static void carpYazdir(double sayi1, double sayi2){   // icine parametrelerimizi yazdik
       System.out.println(sayi1*sayi2);                         //metodu olusturduk bitti ama cagirmak icin
                                                                // metodun disina(main method icine)gidip cagirdik
   }                                                            // ustte method ismini yazip istedigi argumentleri girdik



}
