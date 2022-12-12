package day17_arrays.Haftasonu;

public class Soru2 {
    public static void main(String[] args) {
       // - Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz

int [] arr= {87,55,-25,14,7,2,3,8,-7};

        System.out.println(PozitifleriTopla(arr));
    }
    public static int PozitifleriTopla(int[]arr){
    int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
        if (arr[i]>0){
        toplam+= arr[i];
        }
        }
        return toplam;
    }
    }
