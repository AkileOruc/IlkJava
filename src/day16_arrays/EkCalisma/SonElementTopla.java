package day16_arrays.EkCalisma;

public class SonElementTopla {
    public static void main(String[] args) {
        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin toplaminini yazdiran bir method.

        int[][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 4, 5}, {2}, {1, 2, 3, 4, 5}};

        SonElementleriTopla(arr);

    }

    private static void SonElementleriTopla(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            int i1 =
            toplam+=arr[i][(arr[i].length - 1)];;

        }
        System.out.println("toplam = " + toplam);
    }
}