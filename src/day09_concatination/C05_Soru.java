package day09_concatination;

import java.util.Scanner;

public class C05_Soru {
//C05_Soru  kullanicidan bir mail alin
 // - mail @ icermiyorsa “gecersiz mail”
 //           - mail @gmail.com icermiyorsa, “mail gmail olmali”
 //           - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”


public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);

    System.out.println("lutfen mailinizi girin");
    String girilenMail = scan.nextLine();

    if (!girilenMail.contains("@")) {
        System.out.println("gecersiz mail");

    } else if (!girilenMail.contains("@gmail.com")) {
        System.out.println("mail gmail olmali");

        } else if (!girilenMail.endsWith("@gmail.com")) {
        System.out.println("yazim hatasi var");

    }


}


}





