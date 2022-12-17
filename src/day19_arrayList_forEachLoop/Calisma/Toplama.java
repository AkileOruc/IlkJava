package day19_arrayList_forEachLoop.Calisma;

public class Toplama {
    public static void main(String[] args) {
//bu arraydeki 5 ten buyuk elementleri toplayalim

        int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};
        int toplam=0;
        for (int each:arr     //arr ye git her bir integeri bana getir
             ) {
            if (each>5){
                toplam+=each;
            }
        }
        System.out.println("5' ten buyuk sayilarin toplami " + toplam);
    }
}
