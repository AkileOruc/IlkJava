package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(1986,5,28);

        LocalDate bugun= LocalDate.now();

        Period yas =Period.between(dogumTarihi,bugun);
        System.out.println(yas);           //P36Y6M22D
        System.out.println(yas.getYears());  //36

        LocalDate baslangic =LocalDate.of(2010,8,5);
        LocalDate bitis= LocalDate.of(2015,7,20);


        System.out.println(Period.between(baslangic, bitis));
    }
}
