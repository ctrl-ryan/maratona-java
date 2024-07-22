package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Computador Bom",4000);
        Tomate tomate1 = new Tomate("Tomate Himalaia",4);
        tomate1.setDataValidade("12/02/2024");

        CalculadoraImposto.calcularImpostoProduto(tomate1);

    }
}
