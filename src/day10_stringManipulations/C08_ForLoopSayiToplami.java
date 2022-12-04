package day10_stringManipulations;

public class C08_ForLoopSayiToplami {
    public static void main(String[] args) {

        int sayilarinToplami=0;
        for (int i = 1; i <= 1000; i++) {

            System.out.print(i + " ");
            // sayilarinToplami= sayilarinToplami+i;
            sayilarinToplami +=i;
        }

        System.out.println("");

            System.out.println("tum sayilarin toplami = "+ sayilarinToplami);


    }
}
