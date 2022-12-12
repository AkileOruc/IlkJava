package day17_arrays.Haftasonu;

public class Soru4 {
    public static void main(String[] args) {

        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       // kullanildigini yazdiran bir method olusturun

        String [] arr = {"elma","marul","salatalik","portakal","armut"};
        ArraydeVarMi(arr);

    }

    public static void ArraydeVarMi(String[] arr) {
        
        String arr2= "marul";
        int sayac=0;
        
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==(arr2)) {
                sayac++;
        }

        }
        if (sayac==0)
        System.out.println("Aradiginiz urun bu listede yok " );
else
            System.out.println("Aranan urun " + sayac + " kez bulundu");
    }

    }

