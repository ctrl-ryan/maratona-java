package exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio;

import java.util.Random;
import java.util.Scanner;

public class Midia {
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
        Random random = new Random();
        System.out.println("Insira o código: ");
        codigo = random.nextInt(1000);
        System.out.println(codigo);
        System.out.println("Insira o preço: ");
        preco = random.nextDouble()*100;
        System.out.printf("R$: %.2f\n",preco);
        System.out.println("Insira o nome: ");
        nome = "exemplo";
        System.out.println(nome);
    }

    public void printDados() {
        System.out.println(getDetalhes());
        System.out.println("Tipo: " + getTipo());
        System.out.println("-------------------------");
    }

    public String getTipo(){return "";}

    public String getDetalhes(){return "";}

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
