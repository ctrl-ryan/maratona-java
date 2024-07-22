package exerciciosjava.desafiocalcularinvestimento.tentativa2.teste;

import exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios.Investimento;
import exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios.Investimento1;
import exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios.Investimento2;
import exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios.Investimento3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InvestimentosTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormatBrasil = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int choice;
        int meses;
        double valorInicial;
        double montante = 0;
        Investimento investimento = null;


        System.out.println("Deseja calcular um investimento?\n1-Sim.\n2-Não.");

        if ((choice = scanner.nextInt()) != 1) {
            scanner.close();
            return;
        }

        while (investimento == null) {

            System.out.println("Escolha um investimento:" +
                               "\n1-Investimento com risco baixo." +
                               "\n2-Investimento com risco médio" +
                               "\n3-Investimento com risco alto.");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    investimento = new Investimento1();
                    break;
                case 2:
                    investimento = new Investimento2();
                    break;
                case 3:
                    investimento = new Investimento3();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        System.out.println("Qual seu valor inicial?");
        valorInicial = scanner.nextDouble();
        investimento.setValorInicial(valorInicial);

        System.out.println("Quantos meses pretende deixar investindo?");
        meses = scanner.nextInt();
        investimento.setMeses(meses);

        montante = investimento.calcularInvestimento();
        String formatedNumber = numberFormatBrasil.format(montante);

        System.out.println("Muito bem!\n" +
                           "O seu montantes em " + investimento.getMeses() + " meses será de: " + formatedNumber +
                           "\n\n" +
                           "Deseja registrar seu montante?\n1-Sim.\n2-Não.");

        choice = scanner.nextInt();

        if (choice != 1) {return;}

        investimento.registrarMontante();

    }
}
