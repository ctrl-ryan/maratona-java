package exerciciosjava.NPolimorfismo.Eatividadeunesp.test;

import exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio.Arquivo;
import exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio.MP3;
import exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio.MP4;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Arquivo> arquivos = new ArrayList<Arquivo>();

        System.out.println("Deseja criar um novo arquivo?\n1.Sim\n2.Não");
        int opcao = scanner.nextInt();

        if (opcao == 2) {
            return;
        } else if (opcao != 1) {
            System.out.println("Opção Inexistente.");
            return;
        }

        System.out.println("Escolha o tipo de arquivo: \n1.MP3\n2.MP4");
        int tipoArq = scanner.nextInt();

        while (tipoArq != 1 && tipoArq != 2){
            System.out.println("Escolha uma opção válida.");
            tipoArq = scanner.nextInt();
        }

        System.out.println("Deseja criar quantos arquivos? ");
        int quantArq = scanner.nextInt();

        for (int i = 0; i < quantArq; i++) {
            switch (tipoArq) {
                case 1:
                    arquivos.add(new MP3());
                    break;
                case 2:
                    arquivos.add(new MP4());
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
            System.out.println("Insira os dados...");
            arquivos.get(i).inserirDados();
            System.out.println("-----------------------------");
            System.out.println("Arquivo criado!");
            System.out.println("-----------------------------");
            System.out.println("Visualização do(s) arquivo(s):");
            System.out.println(arquivos.get(i).printDados());
        }
    }
}

