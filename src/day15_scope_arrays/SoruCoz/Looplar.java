package day15_scope_arrays.SoruCoz;

public class Looplar {
    public static void main(String[] args) {
        //merhaba java yazisini 10 defa alt alta once for sonra while dongusu ile yazdirin
        String str= "Merhaba Java";

        for (int i = 0; i <10 ; i++) {
            System.out.println(str);

        }
        System.out.println("**********************");

        String str1= "Merhaba Java";

        int bas=0;
        while (bas<10){
            System.out.println(str1);
            bas++;
        }
    }
}
