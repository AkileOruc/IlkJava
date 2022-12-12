package day13_methodOverloading_whileLoop.ekCalisma;

public class Toplama {

/* 12)Verilen iki sayının toplamını-sıfırdan büyük veya eşit olabilir-hesaplamak ve yazdırmak için bir program oluşturalım
 Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    Ipucu:  IF/Else kullanabilirsiniz.
    Örnek:
    İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme          */
    public static void main(String[] args) {


    long sayi1 = 1000000000L;
    long sayi2 = 1453525;
    long uzunSayi = sayi1 + sayi2;
    long sayi3=sayi1+sayi2;
    int sayac1 = 0;
    int sayac2 = 0;
    int sayac3 = 0;

        while (sayac1 >0) {
        sayi1 = sayi1 / 10;
        sayac1++;
    }
        while (sayi2 > 0){
        sayi2 = sayi2 / 10;
        sayac2++;

    }while(sayac3>0){
        sayi3=sayi3/10;
        sayac3++;
    }

        if(sayac1>10||sayac2>10||sayac3>10){

            System.out.println("sayilarin toplami = " + uzunSayi + " fazla yukleme yaptiniz");
        }else{
            System.out.println("sayilarin toplami = " + uzunSayi );
        }

        System.out.println("sayilar "+sayac1 + " basamakli " + sayac2+" basamakli "+"sonuc " +sayac3+" basamakli");
    }
}
/*System.out.println("Please enter two integer");
int num1 = scan.nextInt();
int num2 = scan.nextInt();

int sum = num1 + num2 ;

if((sum) >= 1000000000 ) {
    System.out.println("Overflow");
}else {
    System.out.println("Sum of the numbers: " + (num1+num2));
}
scan.close();
*/










