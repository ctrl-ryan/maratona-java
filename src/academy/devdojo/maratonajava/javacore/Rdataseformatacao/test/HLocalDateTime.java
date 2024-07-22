package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class HLocalDateTime {
    public static void main(String[] args) {//é basicamente uma junção de LocalTime e LocalDate
//-----------------------------------------------------------------------------------------------

        //Criação de datas com horários:


        //Criar uma data e hora a partir do momento atual:

        LocalDateTime dataEHoraAtual = LocalDateTime.now();


        //Criar uma data e hora a partir de um momento específico:

        LocalDateTime dataEHoraEspecifica = LocalDateTime.of(2025, 4, 3, 0, 0, 0, 0);


        //Criar uma data e hora a partir de uma LocalTime que ja foi criado:

        LocalTime horaJaCriada = LocalTime.of(16, 0, 0);
        LocalDateTime dataEhora = horaJaCriada.atDate(LocalDate.of(2012, 2, 2));


        //Criar data e hora a partir de um LocalDate que ja foi criado

        LocalDate dataJaCriada = LocalDate.of(2024, Month.FEBRUARY, 4);
        dataJaCriada.atTime(LocalTime.now());

        //Criar data e hora a partir de um LocalDate e LocalTime já criados:

        LocalDate dataCriada = LocalDate.now();
        LocalTime horarioCriado = LocalTime.now();

        dataCriada.atTime(horarioCriado);
        horarioCriado.atDate(dataCriada);

        dataCriada.atTime(LocalTime.MAX);
        horarioCriado.atDate(LocalDate.MAX);

        //Criar a partir de uma String:

        LocalDateTime dataEHoraPorString = LocalDateTime.parse("2024-06-20T12:21:20.31234");
        System.out.println(dataEHoraPorString);



//-----------------------------------------------------------------------------------------------

        // Métodos da classe LocalDateTime:

        dataEhora.getYear();
        //.getMonth();
        //.getMonthValue();
        //.getDayOfWeek();
        //.getDayOfYear();
        //.getYear();

        //.getHour();
        //.getMinute();
        //.getSecond();
        //.getNano()
        //...

        //Métodos com constantes de ChronoField:

        dataEhora.get(ChronoField.DAY_OF_WEEK);
    }
}
