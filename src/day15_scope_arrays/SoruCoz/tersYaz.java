package day15_scope_arrays.SoruCoz;

public class tersYaz {

    public static void main(String[] args) {

        /*While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun.*/


        String str = "Java ogrenmek cok guzel";
        String tersStr = "";
        int baslangic = str.length() - 1;

        System.out.println(baslangic);
        while (baslangic>=0){
            tersStr += str.substring(baslangic, baslangic+ 1);
            baslangic--;
        }
        System.out.println(tersStr);
    }
    }

/*int bas = str.length()-1;
        String ters="";
        while (bas>=0){
            ters+=str.charAt(bas);
            bas--;
        }
        System.out.println(ters);*/
