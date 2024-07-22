package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ODateTimeFormatter {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------
//A classe DateTimeFormatter é usada para formatar instâncias de classes como LocalDate, LocalTime, LocalDateTime e ZonedDateTime.

    //Temos alguns padrões de datas já prédefinidos:

        DateTimeFormatter isoOffsetDate = DateTimeFormatter.ISO_OFFSET_DATE;
        DateTimeFormatter basicIsoDate = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //entre muitos outros...

    //É Possível criar seus próprios padrões de data:

        /*
        yyyy: Ano com 4 dígitos
        MM: Mês com 2 dígitos
        dd: Dia do mês com 2 dígitos

        EEE: Dia da semana abreviado (por exemplo, "Seg" para segunda-feira)
        EEEE: Dia da semana completo (por exemplo, "Segunda-feira")
        DDD: Dia do ano com 3 dígitos
         */

    //Exemplo de formato personalizado de data:

        DateTimeFormatter padraoDataPersonalizado = DateTimeFormatter.ofPattern("dd' de 'MMMM 'de' yyyy");
//----------------------------------------------------------------------------------------

    //Usando datas formatadas:

        LocalDate dataDeHoje = LocalDate.now();
        String s = dataDeHoje.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println("Data de hoje com o padrão prédefinido: " + s);

    //Usando padrão personalizado:

        String s1 = dataDeHoje.format(padraoDataPersonalizado);
        System.out.println("Data de hoje com o padrão personalizado: " + s1);

        //----------------------------------------------------------------------------------------

    //Também é possível criar seus padrões de horários:

        /*
        HH: Hora no formato 24 horas com 2 dígitos
        mm: Minutos com 2 dígitos
        ss: Segundos com 2 dígitos

        SSSS: Milissegundos com 3 dígitos
        SSS: Milissegundos com 1 a 3 dígitos
         */

        //Exemplo de horário formatado:

        DateTimeFormatter padraoHorarioPersonalizado = DateTimeFormatter.ofPattern("HH'h'mm'min'");

//-----------------------------------------------------------------------------------------

    //Usando horários formatados:

        LocalTime horaAtual = LocalTime.now();
        String s2 = horaAtual.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("Horário no padrão pré-definido: " + s2);

        //Usando padrão personalizado:

        String s3 = horaAtual.format(padraoHorarioPersonalizado);
        System.out.println("Horário no padrão personalizado: " + s3);

//-----------------------------------------------------------------------------------------
    //E claro, podemos juntar os dois e fazer um padrão de Data e Horário:

        /*
        yyyy: Ano com 4 dígitos
        yy: Ano com 2 dígitos
        M: Mês sem zeros à esquerda
        MM: Mês com 2 dígitos
        MMM: Mês abreviado (por exemplo, "Jan" para Janeiro)
        MMMM: Mês completo (por exemplo, "Janeiro")
        d: Dia do mês sem zeros à esquerda
        dd: Dia do mês com 2 dígitos
        E: Dia da semana abreviado (por exemplo, "Seg" para segunda-feira)
        EEEE: Dia da semana completo (por exemplo, "Segunda-feira")
        HH: Hora no formato 24 horas com 2 dígitos
        hh: Hora no formato 12 horas com 2 dígitos
        mm: Minutos com 2 dígitos
        ss: Segundos com 2 dígitos
        SSS: Milissegundos com 1 a 3 dígitos
        SSSS: Milissegundos com 3 dígitos
        D: Dia do ano
        DDD: Dia do ano com 3 dígitos
        w: Semana do ano
        W: Semana do mês
         */

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'dia' dd 'do mês' MMMM 'do ano' yyyy 'às' HH 'horas e' mm 'min'");

        //Uso do padrão personalizado:

        LocalDateTime dataEHoraAtual = LocalDateTime.now();
        String s4 = dataEHoraAtual.format(dateTimeFormatter);
        System.out.println("Data e hora atual em um padrão personalizado: " + s4);

        //Uso de padrão pré-definido:

        String s5 = dataEHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Data e hora atual em um padrão pré-definido: " + s5);
    }
}
