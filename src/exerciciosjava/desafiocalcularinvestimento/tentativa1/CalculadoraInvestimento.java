package exerciciosjava.desafiocalcularinvestimento.tentativa1;

import java.io.*;
import java.nio.file.Files;

public class CalculadoraInvestimento {
    public static void main(String[] args) {
//        calculo de juros compostos.
//        A=P×(1+r)
//        n

        double valorInicial = 50;
        double juros = 0.05;
        int meses = 3;

        double montante = calcularRendimentoMensal(valorInicial, juros, meses);

        registrarMontante(montante);
    }

    public static double calcularRendimentoMensal(double valorInicial, double juros, int meses) {
        double montante;

        montante = valorInicial * Math.pow(1 + juros, meses);

        return montante;
    }

    public static void registrarMontante(double montante) {
        File file = new File("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercicio_investimento" +
                             "\\resultado_montantes.txt");

        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            if (Files.notExists(file.toPath())) {
                Files.createFile(file.toPath());
            }

            bw.write("O montante após o período é de: ");
            bw.write(String.valueOf(montante));
            bw.newLine();
            bw.flush();

            System.out.println("Montante registrado com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao registrar o montante. " + e.getMessage());
        }
    }

}