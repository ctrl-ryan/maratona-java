package exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.teste;

import exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio.CD;
import exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio.DVD;
import exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio.Midia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Midia> lista = new ArrayList<>();
        System.out.println("Quer criar quantas mídias?");
        int numeroMidias = gerador.nextInt(3) + 1;
        System.out.println(numeroMidias);


        for (int i = 0; i < numeroMidias; i++) {
            System.out.println("=======SELECIONE=======");
            System.out.println("Escolha digitando o número:\n1.CD\n2.DVD");

            int opcao = gerador.nextInt(2)+1;
            System.out.println(opcao);

            System.out.println("=========================");

            switch (opcao) {
                case 1:
                    lista.add(new CD());
                    lista.get(i).inserirDados();
                    break;
                case 2:
                    lista.add(new DVD());
                    lista.get(i).inserirDados();
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    return;
            }
        }
        System.out.println("==========DADOS==========");
        for (int i = 0; i < numeroMidias; i++) {
            lista.get(i).printDados();
        }
    }
}
