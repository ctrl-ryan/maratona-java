package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.util.Locale;

public class DLocale2 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        for (String isoCountry : Locale.getISOCountries()) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();
        for (String isoLanguage : Locale.getISOLanguages()) {
            System.out.print(isoLanguage + " ");

        }
        System.out.println();
    }
}