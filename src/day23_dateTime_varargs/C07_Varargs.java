package day23_dateTime_varargs;

public class C07_Varargs {
    //kac tane Stringargumant yazarsak yazalim en uzununu yazdirsin
    //uzun iki taneyse ilkini yazdirsin versin


    public static void main(String[] args) {
        enUzunuYazdir("Ilyas","Berivan","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");
    }

    private static void enUzunuYazdir(String... kelimeler) {
        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){
                eachKelime=eachKelime;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        
    }
}
