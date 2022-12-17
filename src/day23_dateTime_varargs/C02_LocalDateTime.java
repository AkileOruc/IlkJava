package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {


    public static void main(String[] args) {

        LocalDateTime ldt =LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);    //2022-12-20T12:29:15.380907400     tr de 12.30

        ldt=LocalDateTime.now();
        System.out.println(ldt);     // 2022-12-20T10:30:48.410204     burda 10.30


        System.out.println(ldt.getDayOfWeek());//TUESDAY

        System.out.println(ldt.withYear(2030));


    }
}