package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- Preencha seus dados: ----------");

        System.out.println("Digite seu nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite sua rua: ");
        String rua1 = scanner.nextLine();
        System.out.println("Digite sua cidade: ");
        String cidade1 = scanner.nextLine();
        System.out.println("Digite seu estado: ");
        String estado1 = scanner.nextLine();
        System.out.println("Digite seu cep: ");
        String cep1 = scanner.nextLine();

        System.out.println("---------- Preencha seus dados: ----------\n          (para a segunda pessoa)          ");

        System.out.println("Digite seu nome: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite sua rua: ");
        String rua2 = scanner.nextLine();
        System.out.println("Digite sua cidade: ");
        String cidade2 = scanner.nextLine();
        System.out.println("Digite seu estado: ");
        String estado2 = scanner.nextLine();
        System.out.println("Digite seu cep: ");
        String cep2 = scanner.nextLine();
        scanner.close();

        Endereco endereco1 = new Endereco( rua1, cidade1, estado1,cep1);
        Endereco endereco2 = new Endereco(rua2,cidade2,estado2,cep2);
        Pessoa pessoa1 = new Pessoa(nome1, endereco1);
        Pessoa pessoa2 = new Pessoa(nome2, endereco2);
        pessoa1.imprima();
        pessoa2.imprima();

    }
}
