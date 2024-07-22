package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Dado uma determinada data, deverá retornar o próximo dia útil da semana.
 * Considerando: Sexta, sábado e domingo dias não-úteis
 */
public class MTemporalAdjustersAtividade {
    public static void main(String[] args) {

        System.out.println(proximoDiaUtil(LocalDate.now()));

    }

    public static LocalDate proximoDiaUtil(LocalDate localDate) {
        int diaDaSemana = localDate.getDayOfWeek().getValue();

        switch (DayOfWeek.of(localDate.getDayOfWeek().getValue())) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                diaDaSemana = 1;
                break;
            case THURSDAY:
                diaDaSemana = 4;
                break;
            case FRIDAY:
                diaDaSemana = 3;
                break;
            case SATURDAY:
                diaDaSemana = 2;
                break;
        }

        return localDate.plusDays(diaDaSemana);
    }
}
