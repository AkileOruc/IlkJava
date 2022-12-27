package day23_tatili;

public class Soru43Cons {

/* Soru 43-) Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
 Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
 Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim
 sonra cagırıp konsolda yazdıralım.*/

        String meyve= "Elma";
        int tane=10;
        String renk= "Kirmizi";

   public Soru43Cons ()  {

       renk="Yesil";
   }
    public Soru43Cons(String meyve, int tane) {
        this.meyve = meyve;
        this.tane =tane;

        System.out.println(this.meyve);
        System.out.println(this.renk);
        System.out.println(this.tane);


    }
    public String toString() {
        return "Soru43Cons{meyve='"
                +meyve + '\'' +
                ", adet=" +tane +
                '}';

    }
    public static void main(String[] args) {
        Soru43Cons meyve1=new Soru43Cons();
        Soru43Cons meyve2=new Soru43Cons("Portakal",5);

        System.out.println(meyve1.toString());
        System.out.println(meyve2.toString());
    }
}
