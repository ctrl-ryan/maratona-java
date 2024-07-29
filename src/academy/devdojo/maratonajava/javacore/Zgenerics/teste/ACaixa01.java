package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Dog;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.Caixa;

import java.util.ArrayList;

public class ACaixa01 {
    public static void main(String[] args) {

        ///Aqui, a instância "x" de "Caixa", será usada para trabalhar com a classe Caixa aceitando APENAS tipos String.
        Caixa<String> x = new Caixa<>();
        x.setConteudo("O conteúdo é uma String");
        x.printConteudo();

        ///Aqui, a instância "y" de "Caixa", será usada para trabalhar com a classe Caixa aceitando APENAS tipos Integer.
        Caixa<Integer> y = new Caixa<>();
        y.setConteudo(83829);
        y.printConteudo();

        ///Aqui, a instância "z" de "Caixa", será usada para trabalhar com a classe Caixa aceitando APENAS tipos Dog.
        Caixa<Dog> z = new Caixa<>();
        z.setConteudo(new Dog());
        z.printConteudo();

    }
}
