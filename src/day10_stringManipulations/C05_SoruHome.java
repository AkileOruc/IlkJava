package day10_stringManipulations;

public class C05_SoruHome {
    /*Soru 1 : Kullanicidan bir cumle alin
  - cumlede ev geciyorsa, “home home sweet home” yazdirin
  - cumlede is geciyorsa, “calismak guzeldir”
            - ikisini de iceriyorsa “Hem ev lazim hem is”

     */
    public static void main(String[] args) {
    String str= "Evden calisiyorum buroya gitmeye gerek yok";

    String calisilacakStr= str.toLowerCase();

if (calisilacakStr.contains("ev")&&calisilacakStr.contains("is")){
    System.out.println("home home sweet home");

} else if (calisilacakStr.contains(" is")) {
    System.out.println("calismak guzeldir");

} else if (calisilacakStr.contains("ev")) {
    System.out.println("home home sweet home");

}else {
    System.out.println("cok calisman lazim");
}

    }

}





