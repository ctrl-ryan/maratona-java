package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MTemporalAdjusters {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------
    //TemporalAdjusters é uma classe que possui métodos estáticos que retornam instancias de TemporalAdjuster, que sao usados para fazer ajustes em objetos de data e hora.
//---------------------------------------------------------------------------------------------------
        //Com TemporalAdjusters, é criado um objeto TemporalAdjuster, que serve para ser adicionado a métodos específicos de classes que representam datas e horários, retornando assim uma data com ajuste
//-----------------------------------------------------------------------------------------------------

            //Veja:

        LocalDate dataDeHoje = LocalDate.now(); //Crio um objeto que é a data de hoje.

        TemporalAdjuster ajusteParaEnesimoXDoMes = TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY);//Crio um objeto que é um ajuste para alguma data. (tal ajuste é a primeira sexta-feira do mês que vai receber ajuste.

        LocalDate dataComAjuste = dataDeHoje.with(ajusteParaEnesimoXDoMes); //Coloco a data dataDeHoje para receber o ajusteParaOPrimeiroDiaDoMes.

        System.out.println(dataComAjuste); //Imprimindo a data com ajuste.

            //Outro exemplo:

        LocalDate segundoDiaDoMes = LocalDate.of(2024,1,2);
        TemporalAdjuster ajusteParaOPrimeiroDiaDoMes = TemporalAdjusters.firstDayOfMonth();

        LocalDate dataComAjusteParaOPrimeiroDiaDoMes = segundoDiaDoMes.with(ajusteParaOPrimeiroDiaDoMes);

        System.out.println(dataComAjusteParaOPrimeiroDiaDoMes);

            //Outro exemplo feito de maneira direta:

        LocalDate ultimoDiaDesseMes = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(ultimoDiaDesseMes);

            //Outro exemplo:

        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfYear()));

        //etc...
    }
}
