package day10_stringManipulations;

public class C01_NullPointer {


    public static void main(String[] args) {

      String str1=""  ;
      String str2= "    ";
      String str3;
      String str4= null;
        System.out.println(str1.length());  //0
        System.out.println(str2.length());   //4

        System.out.println(str1.isEmpty());   //true
        System.out.println(str2.isEmpty());    //false

        System.out.println(str1.isBlank());    //true
        System.out.println(str2.isBlank());     //true



       // System.out.println(str3.length());
       // System.out.println(str3.concat("Ali Can"));
        // System.out.println(str3.substring(3,4));


      /* Olusturabildik fakat deger atamadigimiz icin onun uzunlugunu bulamadik
        baska bi variable ile birlestiremedik ve yazdiramadik// kullanamadik   CTE oldu*/

       /*
           java bir variable'i olusturup deger atanmamasina izin verir
           bir variable'i deger atamadan OLUSTURABILIRSINIZ ancak KULLANAMAZSINIZ,
           deger atanmayan bir variable'i kullanmaya kalkarsaniz
           Java CTE verir.
            null pointer ise bu variable'a bir deger atanmadigini
            ve bunun bilincli bir tercih oldugunu Java'ya soyler
            dolayisiyla Java kodlarin calismaya devam etmesine izin verir
            Ancak deger atanmadigi icin method'larla kullanmaya calisirsaniz
            NullPointerException verir
         */




       // System.out.println(str4.length());
       // System.out.println(str4.concat("Ali Can"));
       // System.out.println(str4.substring(3,4));               // NullPointerException


        System.out.println(str4);                           //null
        System.out.println(str4 + "AliCan");               //nullAliCan
        System.out.println(str4.concat("Ali Can"));    //NullPointerException



       /* java bir variable'i olusturup deger atanmamasina izin verir
        bir variable'i deger atamadan OLUSTURABILIRSINIZ ancak KULLANAMAZSINIZ,
        deger atanmayan bir variable'i kullanmaya kalkarsaniz
        Java CTE verir.
        null pointer ise bu variable'a bir deger atanmadigini
        ve bunun bilincli bir tercih oldugunu Java'ya soyler
        dolayisiyla Java kodlarin calismaya devam etmesine izin verir
        Ancak deger atanmadigi icin method'larla kullanmaya calisirsaniz
        NullPointerException verir*/






    }
}
