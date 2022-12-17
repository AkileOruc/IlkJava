package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        int fiyat= 100;
        System.out.println(indirimYap(fiyat));
        System.out.println(indirimYap(fiyat));
        System.out.println(indirimYap(fiyat));
        System.out.println(indirimYap(fiyat));
        System.out.println(indirimYap(fiyat));

        System.out.println(fiyat);
    }

    public static int indirimYap(int fiyat){

        fiyat=fiyat*90/100;

        return fiyat;
    }
}
