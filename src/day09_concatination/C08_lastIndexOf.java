package day09_concatination;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok.";

        System.out.println(str.indexOf("a"));      //1

        System.out.println(str.lastIndexOf("a"));     //39

        str.lastIndexOf("a",15);


        // cok kelimesinin kullanimini kontrol edip
        // kullanilmamis
        // 1 kere kullanilmis
        //birden cok kullanilmis

        int ilkCokIndexi= str.indexOf("cok");
        int sonCokIndexi= str.lastIndexOf("cok");


        if (!str.contains("cok")) {
            System.out.println("kullanilmamis");

        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("1 kere kullanilmis");

        }else {
            System.out.println("birden fazla");
        }


    }


}
