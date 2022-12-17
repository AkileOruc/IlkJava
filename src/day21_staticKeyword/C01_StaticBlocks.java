package day21_staticKeyword;

public class C01_StaticBlocks {




    C01_StaticBlocks()  {
        System.out.println("Constructor calisti");
    }
    public static void main (String[]args){
        System.out.println("Main metod calismaya basladi");
    }
    static {
        //static block lar class teki tum yapilardan hatta main method dan bile once calisir
        System.out.println("Static bloc calisti");

    }
    static {
        System.out.println("Alttaki static bloc calisti");
    }
}
