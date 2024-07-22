package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");

        Jogador jogador1 = new Jogador("Neymar");
        Time time1 = new Time("Flamengo");
        Jogador[] jogadores = new Jogador[]{jogador1};

        time1.setJogadores(jogadores);
        jogador1.setTime(time1);

        System.out.println("---Jogador---");
        jogador1.imprima();
        System.out.println("---Time---");
        time1.imprima();


    }
}
