package exerciciosjava.NPolimorfismo.Daprimorandopolimorfismo.dominio.Caprimorandopolimorfismo.dominio;

import java.util.Random;
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
        Random random = new Random( );
        System.out.println("Insira o numero de faixas:");
        numeroFaixas = random.nextInt(51);
        System.out.println(numeroFaixas);
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return  "Nome: " + this.nome +
                "\nPreço: " + String.format("$.2d",preco) +
                "\nCódigo: " + this.codigo;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
}
