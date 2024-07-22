package exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio;

import java.util.Scanner;

public class DVD extends Midia {
    private int numeroFaixas;

    public DVD(){
    }

    public DVD(int codigo, double preco, String nome, int numeroFaixas) {
        super(codigo, preco, nome);
        this.numeroFaixas = numeroFaixas;
    }


    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero de faixas:");
        numeroFaixas = scanner.nextInt();
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return  "Nome: " + this.nome +
                "\nPreço: " + this.preco +
                "\nCódigo: " + this.codigo;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
}
