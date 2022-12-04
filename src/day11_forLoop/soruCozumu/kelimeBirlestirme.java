package day11_forLoop.soruCozumu;

public class kelimeBirlestirme {

    /* 2 kelimeniz var, her ikisi de 3 karakterden oluşuyor.

    Bunlardan herhangi biri tam olarak 3 karaktere sahip değilse, "birleştirilemez" yazdırın
    Karakterlerinin harflerini 1 harf birinden 1 harf digerinden olacak sekilde birleştirin
    ve aşağıdaki gibi birlikte yazdırın:
ipucu:
    karakterlerin arasına +""+ (empty string (bos dize)) ekleyerek, karakter değerlerini birleştirebilirsiniz.

      Inputs: ear
              pie

    Output:
              epaire          */
    public static void main(String[] args) {
        String str1= "ear";
        String str2= "pie";

        if (str1.length()==3&&str2.length()==3 ){
            System.out.print("kelimelerin birlesimi: "+str1.charAt(0)+str2.charAt(0)+
                    str1.charAt(1)+str2.charAt(1)+str1.charAt(2)+str2.charAt(2));

        }else
            System.out.println("birleştirilemez");

        String input1= "15 €";
        String input2= "11 €";
        // String paraBirimi= input1.substring(6);

        double yeniInput1 = Double.parseDouble(input1);
        double yeniInput2 = Double.parseDouble(input2);
        System.out.println(yeniInput1);






    }
}
