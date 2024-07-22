package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DLocale {
    public static void main(String[] args) {

        //represento uma localização geográfica
        Locale brasil = new Locale("pt", "BR");
        //crio uma instância com a data e hora atuais
        Calendar calendar = Calendar.getInstance();
        //crio um formato de data, com o local (que é Brasil).
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        //faço a impressão do calendar (com a data e hora atuais), com o df.format.
        System.out.println("Brasil: " + df.format(calendar.getTime()));

        Locale india = new Locale("hi","JA");
        System.out.println("Como é \"Brasil\" na Índia: " + brasil.getDisplayCountry(india));

    }


    public static void teste() {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("Índia: " + df3.format(calendar.getTime()));
        System.out.println("Japao: " + df4.format(calendar.getTime()));

        System.out.println(localeJapao.getDisplayCountry(localeJapao));
        System.out.println(localeJapao.getDisplayCountry(localeIndia));
    }
}
