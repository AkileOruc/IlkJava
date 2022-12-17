package day19_arrayList_forEachLoop.Calisma;

public class forEachCarpim {
    public static void main(String[] args) {
       // Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
       // kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int[] arr= {4, 8, 7, 9, 6, 1, 2};
        int carpim=1;
        for (int each:arr) {

            carpim*=each;
        }

        System.out.print(carpim);


    }
}
