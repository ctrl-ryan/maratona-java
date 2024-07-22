package exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio;

import java.util.Scanner;

public abstract class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;

    public Midia() {
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o código: ");
        codigo = scanner.nextInt();

        System.out.println("=========================");
        System.out.println("Insira o preço: ");
        preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("=========================");

        System.out.println("Insira o nome: ");
        nome = scanner.nextLine();

    }

    public void printDados() {
        System.out.println(getDetalhes());
        System.out.println("Tipo: " + getTipo());
        System.out.println("-------------------------");
    }

    public abstract String getTipo();

    public abstract String getDetalhes();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
