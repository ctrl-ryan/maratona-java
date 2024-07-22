package academy.devdojo.maratonajava.javacore.Gassociacao.Bexplicacaoassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Bexplicacaoassociacao.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Gassociacao.Bexplicacaoassociacao.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador1 = new Comprador();

        carro1.setNome("VolksWagen");
        carro1.setComprador(comprador1);
        System.out.println(carro1.getComprador());
        carro1.getComprador().setNome("José");
        System.out.println(carro1.getNome());
        System.out.println(carro1.getComprador().getNome());

    }
}
