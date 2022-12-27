package day23_tatili;

public class AradakiFark {
    public static void main(String[] args) {
  /*2- Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük ve en küçük öğeler
 arasındaki farkı return edin.Not: the built-in
  Math.min(v1, v2) ve   Math.max(v1, v2) methodları en küçük ve en büyük öğeleri return eder.
bigDiff([10, 3, 5, 6]) → 10-3 result = 7    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
bigDiff([2, 10, 7, 1]) → 10-1 result = 9    return tipi  int dir
         */
int [] arr= {10,18, 3, 5, 6,8,3};
        System.out.println(farkiniBul(arr));
    }
    private static int farkiniBul(int[] arr) {
    int max=arr[0];
    int min=arr[0];
int fark=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
             max=arr[i];
            }if (arr[i]<min){
              min=arr[i] ;
            }
        }
fark=max-min;
        return fark;
    }
}
