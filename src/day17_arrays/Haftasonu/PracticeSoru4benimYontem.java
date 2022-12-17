package day17_arrays.Haftasonu;

public class PracticeSoru4benimYontem {


    public static void main(String[] args) {
        String[] arr = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        basHarfler(arr);
    }

    public static void basHarfler(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String yeniArr = "";
            if (arr[i].charAt(arr[i].length() - 1) == 'n' || arr[i].charAt(arr[i].length() - 1) == 'k') {
                yeniArr += arr[i].charAt(0);
            }
            System.out.print(yeniArr);
        }

    }

}