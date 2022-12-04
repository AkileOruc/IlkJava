package day11_forLoop;

public class C10_NestedLoopUcgen {



    /*   1             1. satir 1’den 1’e kadar yazdir
         1 2           2. satir 1’den 2’e kadar yazdir
         1 2 3         3. satir 1’den 3’e kadar yazdir
         1 2 3 4.      4. satir 1’den 4’e kadar yazdir     */

        public static void main(String[] args) {
            // input olarak verilen kenar uzunluklarina gore
            // asagidaki sekli cizdirin
            int kisaKenar=6;
            int uzunKenar=9;
        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
             Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor
         */
            for (int i = 1; i <=kisaKenar ; i++) {
                for (int j = 1; j <=uzunKenar ; j++) {
                    System.out.print("* ");
                }
                System.out.println(""); // satir ile islemimiz bittiginde alt satira gecmesi icin
            }
        }
    }







