package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;


import java.time.Instant;

public class IInstant {
    public static void main(String[] args) {
//---------------------------------------------------------------------------

// Instant representa um ponto específico no tempo, com precisão em nanosegundos, sem considerar fusos horários ou calendários.

//A classe Instant é criado com base em nanossegundos, e como seria muitos números para representar nanosegundos desde 1970, ela possui dois construtores, um com segundos, e outro com segundos e nanossegundos

//---------------------------------------------------------------------------


        //Criação de um Instant:

        //Criar a partir do instânte atual:
        Instant instanteAtual = Instant.now();

        //Criar a partir de um instânte específico:(é baseado em segundos a partir de 1970)

        Instant instantEspecifico = Instant.ofEpochSecond(14123532252L);
        Instant instantEspecifico2 = Instant.ofEpochSecond(14123532252L,1_000_000_000);//⇦ ajuste com nanosegundos


//---------------------------------------------------------------------------

    //Métodos da classe Instant:

        Instant instant = Instant.ofEpochSecond(0);

        instant.getNano();
            // .getEpochSecond();
            // .compareTo()
            // .isAfter()
            // .isBefore()
            // .plus()
            // .minus()
            // .plusSeconds()
    }
}
