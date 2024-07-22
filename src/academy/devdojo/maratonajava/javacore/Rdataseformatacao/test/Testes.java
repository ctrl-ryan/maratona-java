package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Testes {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2011, Month.SEPTEMBER, 11);

        LocalTime localTime = LocalTime.of(12, 55);

        LocalDateTime localDateTime = localTime.atDate(localDate);

        System.out.println(localDateTime);


        test();
    }

    public static void test() {

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();

        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        System.out.println(  ldt.getDayOfYear());

    }

    public static void testeAtividade(){

    }
}
