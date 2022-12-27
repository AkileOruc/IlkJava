package day23_tatili;

public class AyniIlkOge {
    public static void main(String[] args) {
        // Given 2 arrays of ints, a and b, return true if they have the same first element or they have
        // the same last element.         Both arrays will be length 1 or more.
        // commonEnd([1, 2, 3], [7, 3]) → true        commonEnd([1, 2, 3], [7, 3, 2]) → false
        // commonEnd([1, 2, 3], [1, 3]) → true

        // a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya
        // aynı son öğeye sahiplerse true değerini döndürün.
        // Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
        // commonEnd([1, 2, 3], [7, 3]) → true       commonEnd([1, 2, 3], [7, 3, 2]) → false
        // commonEnd([1, 2, 3], [1, 3]) → true

        int a[] = {1, 2, 3};
        int b[] = {1, 2, 7, 3, 2};
        boolean bl = false;
        if (a.length >= 1 && a.length >= 1) {
            if (a[0] == b[0] || a[a.length - 1] == a[a.length - 1]) {
                bl=true;
                System.out.println(bl);
            }

        } else
            System.out.println("eleman sayisi 1 den buyuk olmali");
    }
}