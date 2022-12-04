package day10_stringManipulations.EkCalisma;

public class isimOrtasiSoru {
    public static void main(String[] args) {
        String str="siviliy";
        if(str.length()%2==0){
            System.out.println(str.substring(0, str.length() / 2) + ":)" + str.substring(str.length() / 2));
        }else{
            System.out.println(str.substring(0, str.length() / 2) + ":(" + str.substring(str.length() / 2+1 ));
    }
}
}