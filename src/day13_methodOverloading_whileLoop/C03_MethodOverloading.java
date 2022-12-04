package day13_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

toplama(5.4,6.3);
toplama('a','b');
//ilk olarak %100 uyumlu metodlar arar bulamazsa uyumlu olan biriyle casting yapar
        // ilk olarak %100 uyumlu parametreleri arar
        // %100 uyumlu yoksa calisabilecek method var mi diye kontrol eder
        // calisacak method birden fazla olursa, min. casting yaparak kullanabilecegini tercih eder

        toplama(8.4, 6); // 2 double sayi toplami :14.4

    }

    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplami :" + (sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){System.out.println("2 double sayi toplami :" + (sayi1+sayi2));}
}










