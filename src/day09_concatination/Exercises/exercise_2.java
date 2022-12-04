package day09_concatination.Exercises;

public class exercise_2 {


    public static void main(String[] args) {
       /*
                Kullanicidan bir cumle ve bir metin alin
                cumlede metnin durumuna gore
                1- cumle metni icermiyor
                2- cumle metni sadece 1 kere iceriyor
                3- cumle metni birden fazla iceriyor
                seceneklerinden uygun olani yazdirin
             */
        String str1= "Yeni bir gun, yeni bir baslangic :";
        String str2= "bir";

        int metin= str1.indexOf(str2);
        int metiniki= str1.lastIndexOf(str2);
        if (!str1.contains(str2)){
            System.out.println("cumle metni icermiyor");
        } else if (metin==metiniki){
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }

        System.out.println("******************2.yol*****************");

        if(str1.indexOf("bir")==-1) {
            System.out.println("cumle metni icermiyor");
        } else if (str1.indexOf(str2)==str1.lastIndexOf(str2)) {
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }



    }


}


