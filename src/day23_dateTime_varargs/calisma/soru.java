package day23_dateTime_varargs.calisma;

import java.util.Scanner;

public class soru {
        public static void main (String[]args){
            Scanner scan= new Scanner(System.in);
            System.out.println("Klavyeden Gireceginiz isim Kac Harften Olusuyor?");
            int harf=scan.nextInt();
            System.out.println("Agacinizin Uzunlugu Icin Bir Sayi Giriniz");
            int n=scan.nextInt();
            String[] dizi=new String[harf];
            int sayac=0;

            System.out.println("Bir isim Giriniz (Her Harften Sonra Bosluk En Son Enter'a Basmayi Unutmayınız)");
            for(int i=0;i<dizi.length;i++){
                dizi[i]=scan.next();
            }

            for(int i=0;i<n;i++){
                for(int j=1;j<(n-i);j++){
                    System.out.print(" ");
                }

                for(int k=1;k<=(2*i+1);k++){

                    if(sayac==harf){
                        sayac-=harf;
                        System.out.print(dizi[sayac]);
                        sayac+=1;
                    }else{
                        System.out.print(dizi[sayac]);
                        sayac+=1;
                    }
                }
                System.out.println();
            }

        }
}