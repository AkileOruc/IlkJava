package day19_arrayList_forEachLoop.Calisma;

public class Array {
    public static Object sort;

    public static void main(String[] args) {
        // 6- Verilen String bir array'deki en uzun ve en kisa kelimeleri yazdiran bir method
        // olusturun.

        String[] str = {"ali", "humeyra", "fatih", "azra", "serra"};

        String enUzun = str[0];
        String enKisa = str[0];

        for (String each : str
        ) {
            if (each.length() > enUzun.length()) {
                enUzun = each;
            }
            if (each.length() < enKisa.length()) {
                enKisa = each;
            }

        }
        System.out.println("en kisa : "+ enKisa + "  " +"en uzun: "+ enUzun);
    }
}