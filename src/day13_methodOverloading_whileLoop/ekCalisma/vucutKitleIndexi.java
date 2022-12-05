package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class vucutKitleIndexi {
    public static void main(String[] args) {

        /*Soru 10-)  Klasik Soru:Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
*indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
Kullanıcıya aşağıdaki gibi mesaj verin:

Eğer VKİ 18.5'ten az ise --> zayıfsınız
Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
 VKİ 30'a eşit veya daha fazlaysa --> obez          */



        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen kilonuzu giriniz: kg");
        double agirlik= scan.nextDouble();
        System.out.println(" Lutfen boyunuzu giriniz: m");
        double boy= scan.nextDouble();
        double vki=agirlik/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: "+vki+ " 'dir");

        if (vki>=30)
            System.out.println("Obezsiniz");
        else if (25<=vki && vki<30)
            System.out.println("Sismansiniz");
        else if (18.5<=vki && vki<25)
            System.out.println("Kilonuz idealdir");
        else if (vki<18.5)
            System.out.println("Zayifsiniz");



    }


}
