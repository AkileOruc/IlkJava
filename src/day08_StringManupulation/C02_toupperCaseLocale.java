package day08_StringManupulation;

import java.util.Locale;

public class C02_toupperCaseLocale {
    public static void main(String[] args) {
        String str= "JAVA CANDIR";
        System.out.println(str.toLowerCase());

        str= str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

str= "sevgi insani hayata baglar";

str=str.toLowerCase(Locale.forLanguageTag("TR"));

str=str.toUpperCase(Locale.forLanguageTag("Tr"));

        System.out.println(str);
    }


}
