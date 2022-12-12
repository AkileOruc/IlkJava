package day16_arrays.EkCalisma;

public class arrays3VarMi {

    public static void main(String[] args) {
        //   Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini

        int[] arr= {61,5,4,7,10,20,10,28,79,41,10};

        int aranan=10;

    }
    public static void Bul( int[] arr, int aranan){
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==aranan){
                sayac++;
            }
        }
        if (sayac==0) {
            System.out.println("Aranan sayi bu array de yok");
        } else {
            System.out.println("Aranan sayi bu array de" + sayac + "adet.");
        }
    }
}
