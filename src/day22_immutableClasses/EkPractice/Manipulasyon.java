package day22_immutableClasses.EkPractice;

public class Manipulasyon {

    //    Asagidaki degerleri toplayan bir program yaziniz
    //    12.34$
    //    32.23$
    public static void main(String[] args) {

        String deger1="12.34$";
        String deger2= "32.23$";

        String yeniDeger1=deger1.replaceAll("\\D","");
        String yeniDeger2=deger2.replaceAll("\\D","");
        double sayi1=Double.parseDouble(yeniDeger1);
        double sayi2=Double.parseDouble(yeniDeger2);

        System.out.println((sayi1+sayi2)/100);






    }
}
