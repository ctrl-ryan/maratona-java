package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
