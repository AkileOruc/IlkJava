package day09_concatination;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java ogren, mutlu ol";
        // str mutlu iceriyor

        str.contains("mutlu");    // true

        // charSequence : char dizisi


        System.out.println(str.contains("j"));  //false
        System.out.println(str.contains(" "));    // true


        System.out.println(str.contains("Java") && str.contains("mutlu"));  //true
    }
}
