package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ODateTimeFormatter2 extends ODateTimeFormatter{
    public static void main(String[] args) {
//=====================================================================================
//Podemos passar um tipo String que representa uma data/horário/dataEHorário para um tipo LocalDate/LocalTime/LocalDateTime/ZonedDateTime. Veja:

    //Criando um padrão de data:

         /*
        yyyy: Ano com 4 dígitos
        MM: Mês com 2 dígitos
        dd: Dia do mês com 2 dígitos

        EEE: Dia da semana abreviado (por exemplo, "Seg" para segunda-feira)
        EEEE: Dia da semana completo (por exemplo, "Segunda-feira")
        DDD: Dia do ano com 3 dígitos
         */

    //EX01:

        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("'dia' dd 'do mês' MM 'do ano' yyyy");

        //Convertendo uma string de uma data de um formato personalizado para um LocalDate:

        LocalDate parse = LocalDate.parse("dia 24 do mês 06 do ano 2024",formatoPersonalizado);//Tenho que colocar a string que uma data, e o formato que ela está escrita.
        System.out.println("String em um padrão de data personalizado convertido em um tipo LocalDate: " + parse);

    //EX02:

        //Convertendo uma string de uma data de um formato pré-definido para um Locale:

        DateTimeFormatter formatoPreDefinido = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate parse1 = LocalDate.parse("2021-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("String em um padrão de data pré-definido convertido em um tipo LocalDate: " + parse1);

//-------------------------------------------------------------------------------------------------------------
//Posso também fazer o mesmo com horários:

        //Criando um padrão de horário:

        /*
        HH: Hora no formato 24 horas com 2 dígitos
        mm: Minutos com 2 dígitos
        ss: Segundos com 2 dígitos

        SSSS: Milissegundos com 3 dígitos
        SSS: Milissegundos com 1 a 3 dígitos
         */

    //EX01:

        DateTimeFormatter formatoPersonalizadoHorario = DateTimeFormatter.ofPattern("HH'h'mm'min' 'e' ss'seg'");

        LocalTime parse2 = LocalTime.parse("13h35min e 55seg",formatoPersonalizadoHorario);
        System.out.println("String em um padrão personalizado de data convertido para LocalTime: " + parse2);

//-------------------------------------------------------------------------------------------------------------
//Também posso fazer todas essas coisas com ZonedLocalTime e LocalDateTime:

        System.out.println("ZonedDataTime em um formato personalizado: " + ZonedDateTime.now().format(formatoPersonalizadoHorario));


    }
    }