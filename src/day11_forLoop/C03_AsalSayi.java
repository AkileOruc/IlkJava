package day11_forLoop;

public class C03_AsalSayi {
    public static void main(String[] args) {
        //input verilen tam sayinin asal sayi olup olmadigini yazdirin

  int input= 1149;
 String sonuc= "Sayi asal";
        for (int i = 2; i < input; i++) {


            if (input%i==0){
  sonuc="asaldegil";

                 // Java, bir loop'un icerisinde "break" gorurse
                // o loop'u bitirir
            break;
            }
        }
        System.out.println(sonuc);

    }
}
