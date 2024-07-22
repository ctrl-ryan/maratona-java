package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class JDuration {
    public static void main(String[] args) {
//-------------------------------------------------------------------------------------
    //Duration cria durações com base em horas, minutos, segundos, milissegundos e nanossegundos. Você pode passar qualquer classe que usa essas medidas de tempo citadas antes nos métodos Duration.ofX();, que ele irá converter na unidade de tempo baseada (que são horas, minutos, segundos, milissegundos e nanosegundos.

    //Duration também pode criar durações entre diferentes classes de tempo com base em unidades de hora, segundos, minutos, milissegundos e nanossegundos, como a LocalTime, como a Instant, etc. Já classes como LocalDate, não sao baseadas em nanossegundo, então não pode ser utilizado para criar durações.

    //É diferente da classe Period, a classe Duration trabalha com as unidades de horas, minutos, segundos, milissegundos e nanossegundos. Já a classe Period trabalha com unidade de anos, meses, e dias.
        //-------------------------------------------------------------------------------------

        //Criação de uma duração:

        //Criar a partir de horas:
        System.out.println(Duration.ofHours(100));

        //Criar a partir de minutos:
        System.out.println(Duration.ofMinutes(1000));

        //Criar a partir de segundos:
        System.out.println(Duration.ofSeconds(10000));

        //Criar a partir de milissegundos:
        System.out.println(Duration.ofMillis(10000000));

        //Criar a partir de nanossegundos:
        System.out.println(Duration.ofNanos(10000000000000L));

    //Criar duração a partir de dois diferentes horários:

        //Criar dentre dois horários:

        LocalTime meiaNoite = LocalTime.MIDNIGHT;
        LocalTime meioDia = LocalTime.NOON;

        System.out.println(Duration.between(meiaNoite,meioDia));

        //Criar dentre dois horários:

        LocalTime comecoDoDia = LocalTime.MIN;
        LocalTime fimDoDia = LocalTime.MAX;

        System.out.println(Duration.between(comecoDoDia,fimDoDia));

        //Criar dentre dois horários:

        LocalTime agora1 = LocalTime.now();
        LocalTime horaDeEuMeArrumar = LocalTime.of(15, 30);
        Duration tempoQueFaltaPraEuMeArrumar  = Duration.between(agora1,horaDeEuMeArrumar);
        System.out.println("Tempo que falta pra eu me arrumar para a academia: " + tempoQueFaltaPraEuMeArrumar);

        //Criar entre duas datas:
        // (válido apenas para classes que sao baseados em nanossegundos, como LocalDateTime. Inválido para LocalDate, pois não considera nanossegundos.)

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime hojeMeiaNoite = LocalDateTime.now().plusDays(1).withHour(0).withMinute(0);

        System.out.println(Duration.between(agora,hojeMeiaNoite));

//-----------------------------------------------------------------------------------------



    }

}
