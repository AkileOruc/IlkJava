package day20_Constructor.EkCalisma;

public class Soru34 {
   /*Soru 34-) Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların
   toplamını yazdıran bir Method yazın.
 Örnek
    String str : ade1r4d3
    Int toplam : 8
    İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz*/

   public static void main(String[] args) {


      String str = "ade1r4d3";
      System.out.println(Digits(str));
   }

   public static int Digits(String str) {
      int total = 0;

      for (int i = 0; i < str.length(); i++) {
         if (Character.isDigit(str.charAt(i))) {
            total += Integer.valueOf(String.valueOf(str.charAt(i)));
         }
      }

      return total;
   }
}