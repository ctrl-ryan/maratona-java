package exerciciosjava.desafiocalcularinvestimento.tentativa2.negocios;

import javax.swing.text.NumberFormatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Investimento {
    public final double JUROS_MENSAL;
    private double valorInicial;
    private int meses;
    private final Risco RISCO;

    public Investimento(double JUROS_MENSAL, Risco RISCO) {
        this.JUROS_MENSAL = JUROS_MENSAL;
        this.RISCO = RISCO;
    }

    public void registrarMontante() {

        Path path = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercicio_investimento" +
                              "\\resultado_montantes.txt");


        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
            registrar(path);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na criação do arquivo." + e.getMessage());
        }

    }

    public void registrar(Path path) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        String montanteFormated = numberFormat.format(calcularInvestimento());
        String valorInicialFormated = numberFormat.format(valorInicial);


        try (FileWriter fw = new FileWriter(path.toFile(), true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("O seu valor inicial de " + valorInicialFormated + " em " + meses + " meses no investimento de " + RISCO.riscoString + " resultará em um " +
                     "montante de: " + montanteFormated);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro no registro do montante." + e.getMessage());
        }

    }

    public double calcularInvestimento() {
        return this.valorInicial * Math.pow(1 + this.JUROS_MENSAL, meses);
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }


    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Risco getRISCO() {
        return RISCO;
    }


}
