package day09_concatination;

public class C05_indexOf {
    public static void main(String[] args) {


        String str= "Java ile kodlama cok kolay";

        System.out.println(str.contains("cok"));

        //kullanicidan aldigimz cumlede cok ile baslayan ilk  kelimeyi yazdirin

        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("v"));

        System.out.println(str.indexOf("cok"));

        System.out.println(str.indexOf("a",5));

        // ikinci o nun indexi

        // once ilk o yu buluruz nerede

        int ilkIndex= str.indexOf("o");     //10
        int ikinciIndex= str.indexOf("o",ilkIndex+1);

        str.indexOf("o",ilkIndex);

        System.out.println(ilkIndex+" "+ikinciIndex);




    }
}
