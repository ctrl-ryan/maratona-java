package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        Time time1 = new Time("Flamengo");
        Time time2 = new Time("Vasco");

        Jogador jogador1 = new Jogador("Neymar");
        jogador1.setTime(time1);

        Jogador jogador2 = new Jogador("Ronaldo", time2);

        jogador1.imprima();
        jogador2.imprima();


    }
}
