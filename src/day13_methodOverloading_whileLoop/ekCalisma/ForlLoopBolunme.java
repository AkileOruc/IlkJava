package day13_methodOverloading_whileLoop.ekCalisma;

public class ForlLoopBolunme {
    public static void main(String[] args) {
        //100 den geriye 13 ile bolunen sayilari ve toplamlarini yazdiriniz



        int toplam=0;
        for (int i = 100; i >0 ; i--) {

            if (i%13==0){

                System.out.println(i+" sayisi 13 e tam bolunur");
                toplam+=i;
            }

        }
        System.out.println("toplamlari: "+toplam);



    }
}
