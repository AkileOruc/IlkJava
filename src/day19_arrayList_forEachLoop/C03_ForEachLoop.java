package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

 /*
            Eger coklu element iceren bir yapidaki tum elementlere
            ayni islemi yapmak istiyorsak
            index'den bagimsiz olarak for each loop kullanilabilir
            for each loop'da 3 seyi belirtmemiz gerekir
            1- getirilecek elementlerin data turu
            2- getirilen elemnte verilecek isim (genelde each / w kullanilir)
            3- nereden getirilecegi
         */

        int[] arr= {2,4,6,8,1};

        //tum elementleri yazdirirsak

        for (int each:arr    //arr ye git her bir int i bana getir
             ) {
            System.out.print(each+" ");    //gelen her bir elementi yazdir
            System.out.println(" ");

            //tum elementleri yoplarsak

        }
        int toplam= 0;
        for (int each :arr
             ) {
          toplam+=each;
        }
        System.out.print("toplam = " + toplam);
        //karelerini toplayalim

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.print("kareleri toplam = " + toplam);
    }
}
