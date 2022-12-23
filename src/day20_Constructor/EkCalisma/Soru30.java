package day20_Constructor.EkCalisma;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru30 {
    public static void main(String[] args) {
       /*Soru 30-) Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp
        konteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor


*/      String str = "Javacokkolay";
        String yinelenenKarakterler = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i)== str.charAt(j) && !yinelenenKarakterler.contains(str.charAt(i)+ ""))
                {
                    yinelenenKarakterler = yinelenenKarakterler + str.charAt(i);
                }
            }
        }
        String[] karakterler = yinelenenKarakterler.split("");
        System.out.println(Arrays.toString(karakterler));
    }

}