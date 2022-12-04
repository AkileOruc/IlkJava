package day12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        String str= "ey edip adanada pide ye";
        String tersStr= C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin polindrome");

        }else {
            System.out.println("Verilen metin polindrome degil");
        }






    }
}
