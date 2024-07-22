package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Irei responder suas perguntas.\n");
        System.out.println("Faça uma pergunta: ");

        while (true) {
            String pergunta = input.nextLine();
            if (pergunta.charAt(0) == ' ') {
                System.out.println("Sim.");
            } else {
                System.out.println("Não.");
            }
            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }
        }

    }
}
