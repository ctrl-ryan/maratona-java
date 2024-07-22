package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.util.Calendar;

public class BCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTime());

        System.out.println("Dia do ano: "+ c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: " + c.get(Calendar.HOUR));

        c.add(Calendar.DAY_OF_MONTH,1);
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

    }
}
