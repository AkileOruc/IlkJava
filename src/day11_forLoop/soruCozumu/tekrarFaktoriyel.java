package day11_forLoop.soruCozumu;

public class tekrarFaktoriyel {
    public static void main(String[] args) {


        /*Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720*/
        
        
        int input=6;
        int fact=1;
        String str="";
        for (int i = input; i >=1 ; i--) {
            str=i+"*";


            fact*=i;

            System.out.print(str);


        }

    }
}
