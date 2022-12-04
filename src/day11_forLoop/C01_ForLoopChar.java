package day11_forLoop;

import java.util.Scanner;

public class C01_ForLoopChar {
    public static void main(String[] args) {
// bir karakter alip sonrasindan gelen 10 karakteri yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir karakter girin");

        char Karakter= scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print ((char) (Karakter+i) + " ");

        }



    }
}
