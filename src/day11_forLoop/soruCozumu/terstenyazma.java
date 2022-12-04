package day11_forLoop.soruCozumu;

public class terstenyazma {
    public static void main(String[] args) {
        String input="Reyhan";
        String ters="";
        for (int i = input.length()-1; i >=0 ; i--) {    //yeniStr+=str.substring(i,i+1);
            ters+=input.substring(i,i+1);



        }
        System.out.println("tersten yazilis:"  + ters);
}
}