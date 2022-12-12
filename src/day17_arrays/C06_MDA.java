package day17_arrays;

public class C06_MDA {
    public static void main(String[] args) {
    //Verilen iki katli String bir Array de
        // istenen metni iceren elementleri yazdiran bir method

        String[][]arr={{"Ali","Zafer"},{"Betul","Huseyin","Hasan"},{"Said"}};

        String arananKelime="a";


        istenenElementleriYazdir(arr,arananKelime);
        istenenElementleriYazdir(arr,"e");
        istenenElementleriYazdir(arr,"Ali");




    }

    public static void istenenElementleriYazdir (String[][]arr,String arananKelime){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {


                if (arr[i][j].contains(arananKelime)){
                    System.out.print(arr[i][j]+" ");
                }
            }

        }
        System.out.println(" ");
    }
}
