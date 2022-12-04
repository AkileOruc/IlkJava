package day11_forLoop.soruCozumu;

public class rakamTop {
    public static void main(String[] args) {
       // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        int input= 1453;
        String sayiStr= ""+input;
        int birler= 0;
        int rakTop= 0;

        for (int i = 0; i <=sayiStr.length()-1 ; i++) {
            birler= input%10;
            input=input/10;
            rakTop=rakTop+birler;


        }
        System.out.println(rakTop+"");


    }

}
