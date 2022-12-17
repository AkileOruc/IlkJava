package day17_arrays.Haftasonu;

public class PracticeSoru5Montaine {

    public static void main(String[] args) {
       /* MOUNTAIN ARRAY SORUSU : Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için
        bir kod yazınız.
                Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan
        deger alıyorsa Mountain Array' dir.
        Mountain Array Degil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra
        sürekli artan deger alıyorsa Mountain Array degildir*/

        int[] mountainMi={0,1,2,3,4,5,4,3,2,1,0}  ;
        boolean dagMi1 = false;
        boolean dagMi = false;
        for (int i = 0; i < mountainMi.length / 2; i++) {


            if (mountainMi[i] < mountainMi[i + 1]) {
                dagMi = true;
            } else {
                dagMi = false;
                break;
            }
        }
        for (int i = 0; i <mountainMi.length / 2; i++) {
            for (int j =mountainMi.length / 2 ; j < mountainMi.length; j++) {

            }
            if (mountainMi[i] < mountainMi[i + 1]) {
                dagMi1 = true;
            } else {
                dagMi1 = false;
                break;

                    }
                }
                if (dagMi == true && dagMi1 == true) {
                    System.out.println("mountain array");
                } else {
                    System.out.println("mountain array degil");
                }

            }  }

