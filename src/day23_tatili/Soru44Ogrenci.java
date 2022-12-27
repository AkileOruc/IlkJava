package day23_tatili;

import com.sun.tools.javac.Main;

public class Soru44Ogrenci {

    public static void main(String[] args) {
        /*Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
   Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
   methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
   Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
   Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
   Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.*/

        //Main methodda ögrenci bilgileri oluşturun
       String prenom= "Valerie";
       String nom="Gerard";
       String ecole= "Lyce Victor Hugo";
       String classe= "2";
       int numero= 1478;
        Changenom(prenom,nom,ecole,numero,classe);

    }
//Changename adında bir method oluşturun methodda tüm bilgileri değiştirin
    private static void Changenom(String prenom, String nom, String ecole, int numero, String classe) {
       prenom= "Victoria";
       nom="Richard";
       ecole= "Lyce Jean";
       classe= "3";
       numero= 1218;
//yeni bilgileri ekleyip yazdırın.
        System.out.println("prenom="+prenom+ "\nnom="+ nom+ "\ncole="+ecole+"\nnumero="+ numero+ "\nclasse"+ classe);





    }
}