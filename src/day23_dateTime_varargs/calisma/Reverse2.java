package day23_dateTime_varargs.calisma;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int[] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        System.out.println("Original array : "+ Arrays.toString(array1));
        for(int i = 0; i < array1.length / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[array1.length - 1-i ];
            array1[array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(array1));
    }
}
