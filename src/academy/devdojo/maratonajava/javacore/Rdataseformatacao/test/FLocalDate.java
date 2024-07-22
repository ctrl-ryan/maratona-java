package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class FLocalDate {
    public static void main(String[] args) {

//------------------------------------------------------------------------------------------------

        //Criação de datas:

            //criando a partir de uma data específica usando um enum Month
        LocalDate meuNascimento = LocalDate.of(2006, Month.MARCH,4);

            //criando a partir de uma data específica.
        LocalDate meuNascimento2 = LocalDate.of(2006, 4, 3);

            //criando uma data específica.
        LocalDate dataDoDiaQueEuEstavaAprendendoIsso = LocalDate.of(19, 6, 19);

            //criando uma data a partir de agora (com base no seu sistema operacional).
        LocalDate agora = LocalDate.now();

            //criando uma data a partir de uma String:

        LocalDate dataPorString = LocalDate.parse("2024-06-29");
        System.out.println(dataPorString);

//------------------------------------------------------------------------------------------------

        //Métodos da classe LocalDate:

        agora.getYear();
           //.getMonth
           //.getMonthValue
           //.getYear
           //.getYear
           //...

        agora.plusWeeks(2);
        //.plusYears
        //.plusMonths
        //.plusWeeks
        //...

        //Podemos usar métodos com algumas constantes do ChronoField:

        agora.get(ChronoField.DAY_OF_YEAR);
        //.get(ChronoField.YEAR);
        //.get(ChronoField.MONTH_OF_YEAR);
        //.get(ChronoField.DAY_OF_WEEK);
        //.get(ChronoField.ERA);
        //...

        //Outros métodos:

        agora.withYear(1);// ⇦dessa maneira eu defino um ano, ao invés de adicionar um ano.

//------------------------------------------------------------------------------------------------


        //Posso transformar o LocalDate em um LocalDateTime (que é a junção dos dois), usando:

        agora.atTime(10,50);

//------------------------------------------------------------------------------------------------

/*      //Posso adicionar anos, dias, meses, semanas a uma data:
        (preciso atribuir a uma nova variável, pois LocalDate é imutável)             */

        agora.plusYears(2);
           //.plusMonths()
           //.plusWeeks()
           //.plusDays()
    }
}
