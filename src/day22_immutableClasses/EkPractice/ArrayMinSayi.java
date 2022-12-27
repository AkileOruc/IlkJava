package day22_immutableClasses.EkPractice;

public class ArrayMinSayi {
    public static void main(String[] args) {
        /* {{1,2,3}, {2,3,1},{5,5,5}, {2,1,3};
        2D arrayinden minimum sayiyi print edelim
         */
        int [][] arr={{1,2,3}, {2,3,1},{5,0,5}, {2,1,3}};
       int min=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("minimum deger = " + min);
    }
}
