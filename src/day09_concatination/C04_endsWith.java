package day09_concatination;

public class C04_endsWith {
    public static void main(String[] args) {
        String str= "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));    //true

        System.out.println(str.endsWith(("Java ogrenen issiz kalmaz")));     //true

        System.out.println(str.endsWith(""));     //true



    }
}
