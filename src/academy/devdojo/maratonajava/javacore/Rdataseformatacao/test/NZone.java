package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.*;

/**
 * <javadoc> Trabalhar com horas levando em consideração as zonas</javadoc>
 */
public class NZone {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------
    //A classe ZoneId representa uma região geográfica específica onde se aplicam regras de fuso horário. Ela é usada para identificar um fuso horário.

    //O LocalDateTime representa data e horário, mas nao tráz nenhuma informação sobre fusos horários. Já o ZonedDateTime é diferente, ele tráz a data, horário e zona.

     //Métodos:

        //Criar um ZoneId com base em uma string:

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");

        //Criar uma zona com o padrão do seu sistema:

        ZoneId zoneId1 = ZoneId.systemDefault();

        //Mostrar ZoneId's existentes:

        ZoneId.getAvailableZoneIds();



//-----------------------------------------------------------------------------------------
//A classe ZonedDateTime representa uma data e hora com um fuso horário específico. Ela combina a funcionalidade de LocalDateTime e ZoneId.

    //Podemos criar um ZonedDateTime com o horário, data, e zona atual:

        ZonedDateTime now = ZonedDateTime.now();

    //Podemos criar um ZonedDateTime com o horário e data atual, mas em uma zona diferente:

        ZoneId zonaDeTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime.now(zonaDeTokyo);

    //Criar ZonedDateTime com outro horário, data e zona:

        LocalTime horarioQualquer = LocalTime.of(12, 10, 50);
        LocalDate dataQualquer = LocalDate.of(2020, 1, 10);
        LocalDateTime dataEHorarioQualquer = LocalDateTime.of(dataQualquer, horarioQualquer);

        ZonedDateTime.of(dataEHorarioQualquer,zonaDeTokyo);

    //Criar ZonedDateTime com o horário UTC:

        Instant horarioUTC = Instant.now();
        ZonedDateTime.ofInstant(horarioUTC,zoneId);//<--- vai mostrar a hora do meu sistema, pois eu coloquei a zona de São Paulo.

//-----------------------------------------------------------------------------------------
//A classe OffsetDateTime representa uma data e hora com um deslocamento de fuso horário específico. Diferente de ZonedDateTime, que usa uma região geográfica, OffsetDateTime usa um deslocamento fixo em relação ao UTC. Ou seja, ao invés de precisar colocar um zone id para mudar o horário, eu preciso colocar apenas a diferença de horas de uma zona para o horário UTC.


         OffsetDateTime.now(); //-> retorna o horário atual do sistema, com "-03:00", que é a diferença de horário em relação ao UTC, ao invés de mostrar a zona atual

    //Podemos criar a diferença de horários:

        ZoneOffset zoneOffset = ZoneOffset.of("-12:00");//-> Há um limite de +18:00 e -18:00

    //E podemos criar um horário e data qualquer, subtraindo com o ZoneOffset criado:

        LocalDateTime dataEHoraQualquer = LocalDateTime.of(2020, 3, 4, 12, 23, 00);

        ZoneOffset zoneOffset1 = ZoneOffset.of("-18:00");

        OffsetDateTime.of(dataEHoraQualquer,zoneOffset1);

    //Podemos criar um OffsetDateTime com horário e data atual, subtraindo com um ZoneOffset criado:

        OffsetDateTime.now(zoneOffset1);

    }
}
