package day21_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {
        int fiyat= 100;
indirimYap10(fiyat);
indirimYap20(fiyat);
indirimYap30(fiyat);
        System.out.println(fiyat);
    }



    public static void indirimYap10(int fiyat){

        fiyat= fiyat*90/100;
        System.out.println(fiyat);

    }
    public static void indirimYap20(int fiyat){
        fiyat=fiyat*80/100;
        System.out.println(fiyat);
    }
    public static void indirimYap30(int fiyat){
        fiyat=fiyat*70/100;
        System.out.println(fiyat);
    }
}
