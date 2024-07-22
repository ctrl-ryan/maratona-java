package exerciciosjava.NPolimorfismo.Eatividadeunesp.dominio;

import java.util.Scanner;

public abstract class Arquivo {
    protected int kbytes;
    protected double preco;
    protected String autor;

    public Arquivo() {
    }

    public Arquivo(int kbytes, double preco, String autor) {
        this.kbytes = kbytes;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTipo() {
        return "Mídia: ";
    }

    public String getDetalhes() {
        return "Tamanho: " + this.kbytes + "\n" +
                "Preço: " + this.preco + "\n" +
                "Autor: " + this.autor + "\n";
    }

    public String printDados() {
        return getDetalhes() +
                getTipo();
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tamanho do arquivo: ");
        this.kbytes = scanner.nextInt();
        System.out.println("Insira o preço do arquivo:");
        this.preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira o autor do arquivo: ");
        this.autor = scanner.nextLine();

    }
}
