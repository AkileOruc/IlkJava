package day14_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

    //verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin

     char baslangic= 'd';
     char bitis='m' ;

     do {
         System.out.print(baslangic+ " ");    //yazdirmayi icerde yaptik cunku islem yok, yazdircaz
         baslangic=(char) (baslangic+1);  //baslangic++; yapabilirdik



     }while (baslangic<=bitis);






    }
}
