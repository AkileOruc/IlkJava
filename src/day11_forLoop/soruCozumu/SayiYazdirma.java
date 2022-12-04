package day11_forLoop.soruCozumu;

public class SayiYazdirma {
    public static void main(String[] args) {
        /*Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.*/



        int input=1453;
        int rakamlarToplami=0;
        for (int i = 1; i <=4 ; i++) {
            rakamlarToplami+=input%10;
            input=input/10;
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);

    }
    }

