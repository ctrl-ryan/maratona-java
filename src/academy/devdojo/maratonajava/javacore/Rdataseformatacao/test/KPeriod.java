package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import javax.swing.text.html.HTML;
import java.time.*;

public class KPeriod {
    public static void main(String[] args) {
//------------------------------------------------------------------------------------
//Period cria um período com base em anos, meses e dias (desconsiderando horas, minutos, etc). Por esse motivo, não pode usar classes que possuem unidades de medida que utilizam o mesmo (Como: LocalDateTime, Instant, LocalTime, etc).

//Diferente de Duration, que ao colocar Duration.ofMinutes(60); retornará 1H, o Period ao colocar Period.ofDays(365); não retornará 1Y (pelo motivo na qual, creio eu, existem anos que nao possuem 365 dias, assim como nem todos os meses possuem 30 dias)

// É diferente da classe Period, a classe Duration trabalha com as unidades de horas, minutos, segundos, milissegundos e nanossegundos. Já a classe Period trabalha com unidade de anos, meses, e dias.

//------------------------------------------------------------------------------------

    //Criação de um período:

        //Criar a partir de anos:
        System.out.println(Period.ofYears(1));

        //Criação a partir de meses:
        System.out.println(Period.ofMonths(12));

        //Criação a partir de semanas: (Period nao trabalha com semanas, porém, ele considera 1 semana como 7 dias)
        System.out.println(Period.ofWeeks(1));

        //Criação a partir de dias:
        System.out.println(Period.ofDays(365));

    //Criação de períodos a partir de datas:

        //Criar dentre duas datas:

        LocalDate agora  = LocalDate.now();
        LocalDate anoQueVem = agora.plusDays(365);
        Period periodoDaquiPraAnoQVem = Period.between(agora,anoQueVem);
        System.out.println(periodoDaquiPraAnoQVem);


        //Criar dentre duas datas:

        LocalDate agora2 = LocalDate.now();
        LocalDate daqui2meses = agora2.withMonth(Month.DECEMBER.getValue());
        System.out.println(Period.between(agora2,daqui2meses));

        //Criar entre duas datas:

        LocalDate hoje = LocalDate.now();
        LocalDate alistamento = LocalDate.of(Year.now().getValue(),Month.JULY,23);
        Period tempoQueFaltaProAlistamento = Period.between(hoje, alistamento);
        System.out.println("Périodo que falta pra eu me alistar: " + tempoQueFaltaProAlistamento);

        //------------------------------------------------------------------------------------

    //Se criarmos um período com base em, por exemplo, anos, dias, ou meses, e tentarmos usar um .getX(); para uma unidade que ele não foi criado no Period.ofX();, sempre retornará 0.

    //Exemplo: Se eu criar um Period usando Period.ofYears(1); e usar um .getMonths(); para saber o número de meses, retornará 0, pois o valor foi armazenado como 1 ano, e  não em 12 meses/365 dias.


        //Exemplos:

        Period period3 = Period.ofYears(1);
        System.out.println(period3.getDays());

        Period period1 = Period.ofMonths(3);
        System.out.println(period1.getMonths());

        Period period2 = Period.ofDays(365);
        System.out.println(period2.getYears());


    //Para podermos pegar um valor de um Period sem ser na unidade em que ele foi criado, precisamos usar o ChronoVoid entre duas datas.
    }
}
