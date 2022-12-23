package day23_dateTime_varargs.calisma;

public class okul {
    public static void main(String[] args) {
       /* 2.  Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        Assume that the given number is 1 ~ 18*/


        byte yas= 5;

        switch (yas){
            case 1,2,3,4,5:
            System.out.println("Elementery scool");
            break;
            case 6:  case7:  case8:
            System.out.println("Elementery scool");
            break;
            case 9:  case10:  case11: case12:
            System.out.println("High scool");
                break;
            case 13:  case14:  case15: case16:
            System.out.println("Elementery scool");
                break;
            case 17:  case18:
            System.out.println("Elementery scool");
                break;
            default:
                System.out.println("Sinifini ogrenmek istediginiz yas gecersiz ");
        }
    }
}
