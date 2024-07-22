package exerciciosjava.NPolimorfismo.Caprimorandopolimorfismo.dominio;

import java.util.Scanner;

public class CD extends Midia {
    private int numeroMusicas;

    public CD(){
    }

    public CD(int codigo, double preco, String nome, int numeroMusicas) {
        super(codigo, preco, nome);
        this.numeroMusicas = numeroMusicas;
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de musicas:");
        this.numeroMusicas = scanner.nextInt();
    }


    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return  "Nome: "  + this.nome +
                "\nPreço: " + this.preco +
                "\nCódigo: " + this.codigo;
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
}
