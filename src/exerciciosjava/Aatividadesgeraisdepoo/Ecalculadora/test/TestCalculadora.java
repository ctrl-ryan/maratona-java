package exerciciosjava.Aatividadesgeraisdepoo.Ecalculadora.test;

import exerciciosjava.Aatividadesgeraisdepoo.Ecalculadora.dominio.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        OperacaoMatematica calculadora;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação:\n1.Somar\n2.Subtrair\n3.Multiplicar\n4.Dividir\n5.Sair");
        int opcao = scanner.nextInt();

        if (opcao == 5) {
            return;
        } else {
            System.out.println("Digite o primeiro número:");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calculadora = new Adicao();
                    System.out.println("Resposta: " + calculadora.calcular(num1,num2));
                    break;
                case 2:
                    calculadora = new Subtracao();
                    System.out.println("Resposta: " + calculadora.calcular(num1,num2));
                    break;
                case 3:
                    calculadora = new Multiplicacao();
                    System.out.println("Resposta: " + calculadora.calcular(num1,num2));
                    break;
                case 4:
                    calculadora = new Divisao();
                    System.out.println("Resposta: " + calculadora.calcular(num1,num2));
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }
    }
}
