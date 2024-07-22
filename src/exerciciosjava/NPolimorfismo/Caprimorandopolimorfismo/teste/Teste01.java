package exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.teste;

import exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio.CD;
import exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio.DVD;
import exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio.Midia;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Midia> lista = new ArrayList<>();
        System.out.println("Quer criar quantas mídias?");
        int numeroMidias = scanner.nextInt();


            for (int i = 0; i < numeroMidias; i++) {
                System.out.println("=======SELECIONE=======");
                System.out.println("Escolha digitando o número:\n1.CD\n2.DVD");

                int opcao = scanner.nextInt();

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
