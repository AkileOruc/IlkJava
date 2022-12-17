package day17_arrays.Haftasonu;

//4-String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
// o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
     //   Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ


public class PracticeSoru4Svly {
    public static <basharf> void main(String[] args) {

        String arr []= {"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };

        basHarfler(arr);
    }public static void basHarfler(String[] arr){


        for (int j = 0; j <arr.length ; j++) {
            String temps=" ";


            if(arr[j].substring(arr[j].length()-1).equalsIgnoreCase("n")
                    ||arr[j].substring(arr[j].length()-1).equalsIgnoreCase("k")){

                temps+=arr[j].charAt(0);
            }
            System.out.print(temps);
        }

                }

            }

