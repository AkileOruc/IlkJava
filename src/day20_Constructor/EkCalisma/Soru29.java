package day20_Constructor.EkCalisma;

public class Soru29 {
    public static void main(String[] args) {
// Soru29-) 1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.İpucu: Loop

        int toplam=0;
        for (int i = 1; i <100 ; i++) {
           toplam+=i;

        }
        System.out.println("toplam = " + toplam);
    }
}
