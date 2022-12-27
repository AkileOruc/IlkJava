package day23_tatili;

public class Soru42Varargs {
    public static void main(String[] args) {
 /*  Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir
 dönüş methodu (void) yazın  Method name=sum   eğer metodu bu şekilde çağırırsanız
     toplam(1,2,3) çıktı =6       toplam(1,2,3,4,5) çıktı =15    sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım*/

        varargslaTopla(5,4,4,1,0,2,13,5,7);
    }
    private static void varargslaTopla(int... toplananlar) {

        int toplam= 0;
        for (int each:toplananlar) {
            toplam+=each;
        }
        System.out.println("toplam = " + toplam);
    }
}
