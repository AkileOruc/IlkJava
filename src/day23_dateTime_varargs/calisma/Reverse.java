package day23_dateTime_varargs.calisma;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        int[] siralama = {1,2,3,4,5};
        List<Integer> ters=new ArrayList<>();
        for (int i =siralama.length-1 ; i >=0 ; i--) {
            
            ters.add (siralama[i]);
        }
        System.out.println("ters = " + ters);
    }
}
