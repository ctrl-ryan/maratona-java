package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalUnit;
/**
 * Algumas informações sobre o ChronoVoid <b> javadoc </b>
 */
public class LChronoUnit {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------

    //Para resolver o problema que tínhamos de nao conseguir extrair anos/meses/dias de uma data à outra, podemos usar o ChronoVoid para resolver:


    //Ao invés de:

        LocalDate agora = LocalDate.now();
        LocalDate umAnoDepois = agora.plusYears(1);
        Period period = Period.between(agora,umAnoDepois);

        System.out.println(period.getMonths());

    //Faremos:

        long meses = ChronoUnit.MONTHS.between(agora,umAnoDepois);
        System.out.println(meses);

    //Ou então:

        long meses2 = agora.until(umAnoDepois,ChronoUnit.MONTHS);
        System.out.println(meses2);


//----------------------------------------------------------------------------------------




    }
}
