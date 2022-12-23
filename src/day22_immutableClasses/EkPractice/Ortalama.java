package day22_immutableClasses.EkPractice;

public class Ortalama {
    public static void main(String[] args) {
        //Verilen arrayin ortalamasini bulunuz ve ortalamadan buyuk olan sayilari yazdirin
        int arr []={11,12,13,14,15,16,17};
        int top=0;
        for (int i = 0; i <arr.length ; i++) {

           top=top+arr[i];
        }
        int ort= top/arr.length;
        System.out.println("sayilarin ortalamasi= " + ort);

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>ort){

                System.out.println(arr[i] +" sayisi ortalamadan buyuktur. " );
            }

        }
    }
}
