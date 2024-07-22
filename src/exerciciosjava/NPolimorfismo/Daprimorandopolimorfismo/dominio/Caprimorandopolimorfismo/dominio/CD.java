package exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio;

import java.util.Random;
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
        Random random = new Random( );
        System.out.println("Insira o número de musicas:");
        this.numeroMusicas = random.nextInt(51);
        System.out.println(numeroMusicas);
    }


    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return  "Nome: "  + this.nome +
                "\nPreço: R$" + String.format("%.2f",preco)+
                "\nCódigo: " + this.codigo;
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }


    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
}
