package day08_StringManupulation;

public class C05_charAt {

    public static void main(String[] args) {
        String str="Java Guzeldir";     //13 tane karakter var

        //java da index 0 dan baslar
        // J==> 0 inci index
        //charAt(index) ile istedigimiz indexteki char a ulasiriz
        System.out.println(str.charAt(1));


        //sondan 2.harf
        System.out.println(str.charAt(13-2));

        //sondan 4 uncu karakter buyuk
        System.out.println(str.toUpperCase().charAt(13 - 4));
        //charAt metodu bize char dondurdugu icin toUpperCase calismaz
        //charAt ten once kullanmaliyiz

       // System.out.println(str.charAt(13));  //StringIndexOutBoundException // 13.index yok


    }
}
