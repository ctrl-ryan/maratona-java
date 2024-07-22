package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Computador Bom",4000);
        Produto produto2 = new Tomate("Tomate Himalaia",4);


        CalculadoraImposto.calcularImpostoProduto(produto1);
        CalculadoraImposto.calcularImpostoProduto(produto2);
    }
}
