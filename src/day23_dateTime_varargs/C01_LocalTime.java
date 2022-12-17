package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime zaman= LocalTime.now();   //10:08:37.004862600
        System.out.println(zaman);

        System.out.println(zaman.getMinute());  //8

        System.out.println(zaman.withSecond(0).withNano(0));  //10:13:01.000000001
        System.out.println(zaman.withSecond(1).withNano(1));  //10:13:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250));//18:23:21.865952400


    }


}
