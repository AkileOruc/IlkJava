package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class soruSwichCase {
    public static void main(String[] args) {
        /*
        Soru 13-)
Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
Ipucu:
Switch konusunu hatırlayalım!
         */
        char chr='a';

        switch (chr){
            case 'a':
                System.out.println("isteginiz isleniyor");break;
            case 'b':
                System.out.println("Degerlendirmeniz icin yine de tesekkür ederiz");break;
            case 'c':
                System.out.println("uzgunum suanda yardimci olamiyoruz");break;
            default:
                System.out.println("Gecersiz giris, lutfen tekrar deneyin!");break;
        }
    }
}
