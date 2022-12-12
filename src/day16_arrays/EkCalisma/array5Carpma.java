package day16_arrays.EkCalisma;

public class array5Carpma {

    /* Verilen 2 katli bir array de bulunan tum sayilarin carpimini donduren bir method */
    public static void main(String[] args) {


    int [][] arr= { {1,9},{6,7,8},{3,5}};

        System.out.println(ArrayCarp(arr));


    }
  public static int ArrayCarp(int [][] arr){
      int carpim=1;

      for (int i = 0; i < arr.length; i++) {

          for (int j = 0; j <arr[i].length ; j++) {
            carpim*=arr[i][j];
          }
      }

      return carpim;
  }
}
