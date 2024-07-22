package exerciciosjava.Gassociacao.Aexercicio.test;

import exerciciosjava.Gassociacao.Aexercicio.dominio.Carro;
import exerciciosjava.Gassociacao.Aexercicio.dominio.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Pessoa pessoa1 = new Pessoa("Ryan",18);

        pessoa1.setCarro(carro1);
        carro1.setMarca("Volkswagen");
        carro1.setNomeModelo("Crossfox");
        pessoa1.imprima();
        System.out.println(pessoa1.getCarro().getMarca());
        System.out.println(pessoa1.getCarro().getNomeModelo());

    }
}
