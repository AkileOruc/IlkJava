package day23_dateTime_varargs.calisma;

public class MyClass {
    int x=1;
    static int y;
    MyClass(int i){
        x=x+i;    //1+5=6
        y=y+i;    //0+5=5
    }

    public static void main(String[] args) {
        MyClass obj1= new MyClass(5);
        System.out.println(obj1.x+","+obj1.y);       //6,5
        MyClass obj2= new MyClass(7);
        System.out.println(obj2.x+","+obj2.y);       //8,12
    }
}
