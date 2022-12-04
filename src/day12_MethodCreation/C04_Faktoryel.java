package day12_MethodCreation;

public class C04_Faktoryel {

    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin
        int input= 12;


        if (input>0 && input<15){
            faktoryelYazdir(input);     //methodu cagirdik
        } else {
            System.out.println("Girilen sayi 15'den kucuk pozitif tamsayi olmalidir");
        }
    }
    public static void faktoryelYazdir(int sayi){
        int faktoryelSonucu=1;     //buraya for i den once bir sepet hazirlayip sonuclari icine atmaliyiz

        for (int i = sayi; i >=1 ; i--) {

            faktoryelSonucu *= i; // her loop'da gelen sayiyi onceki deger ile carpalim(capip carpip sepete atiyoruz)
        }
        System.out.println("Girilen " + sayi + " icin faktoryel : " + faktoryelSonucu);
    }
}



