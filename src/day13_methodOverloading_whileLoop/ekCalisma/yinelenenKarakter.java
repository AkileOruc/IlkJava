package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class yinelenenKarakter {
    public static void main(String[] args) {

/*14)Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir kelime giriniz");
        String str = scan.next();
        if (str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2))
            System.out.println("Dize yinelenen karakterlere sahip");
        else if (str.charAt(1) == str.charAt(2))
            System.out.println("Dize yinelenen karakterlere sahip");
        else
            System.out.println("Dize benzersiz sahip");
    } }

//            for (int i = 0; i <str.length()-1 ; i++) {
//            if(str.substring(i+1).contains(str.substring(i,i+1))){
//
//                count++;
//            }
//        }
//
//        System.out.println(count > 0 ? "Tekrarlayan eleman var" : " tekrarlayan eleman yok");
//