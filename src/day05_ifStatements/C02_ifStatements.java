package day05_ifStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {


        // Kullanicidan bir sayi alip
// pozitif ise "pozitif sayi",
// 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
// 3 ile bolunebiliyorsa "3'un kati"
// birler basamagi 7 ise "Mukemmel"
// seceneklerinden uygun olanlari yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if  (sayi>0){
            System.out.println("pozitif");
        }if (sayi>99 && sayi<1000){
            System.out.println("poziif 3 basamakli");
        }if (sayi%3==0){
            System.out.println("3'un kati");
        }if (sayi%10==7){
            System.out.println("Mukemmel");

        }

    }

}




