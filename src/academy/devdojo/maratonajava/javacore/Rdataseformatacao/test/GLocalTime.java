package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;


import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class GLocalTime {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------

    //Criação de horários:

        //Criação a partir de um horário específico:
        LocalTime horarioMaximo = LocalTime.of(23, 59, 59);

        //Criação a partir do horário atual:
        LocalTime agora = LocalTime.now();

        //Criação a partir de uma String:
        LocalTime horarioPorString = LocalTime.parse("23:33:55.89734");
        System.out.println(horarioPorString);

//-----------------------------------------------------------------------------------------------


        //Métodos da classe LocalTime:
            agora.getHour();
           //.getMinute
           //.getSecond
           //.getNano
           //...

        agora.plusHours(2);
           //.plusMinutes();
           //.plusSeconds();
           //.plusNanos();


        //Podemos usar algumas constantes do ChronoField:

        agora.get(ChronoField.MILLI_OF_SECOND);
        //.get(ChronoField.SECOND_OF_DAY);
        //...



    }
}
