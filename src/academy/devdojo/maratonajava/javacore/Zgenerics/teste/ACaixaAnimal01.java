package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Animal;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Cat;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Dog;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CaixaAnimal;

public class ACaixaAnimal01 {
    public static void main(String[] args) {

    ///Aqui, a instância caixaDog é usado para trabalhas APENAS com tipos Dog.
        CaixaAnimal<Dog> caixaDog = new CaixaAnimal<>();
        caixaDog.setConteudo(new Dog("Beilly"));
        caixaDog.printNome();

    ///Aqui, a instância caixaCat é usado para trabalhas APENAS com tipos Cat.
        CaixaAnimal<Cat> caixaCat = new CaixaAnimal<>();
        caixaCat.setConteudo(new Cat("Remynho"));
        caixaCat.printNome();

    ///Aqui, a instância caixaAnimal é usado para trabalhas com tipos Animal (isso quer dizer que pode trabalhar também com tipos Dog e Cat).
        CaixaAnimal<Animal> caixaAnimal = new CaixaAnimal<>();
        caixaAnimal.setConteudo(new Dog("Luna"));
        caixaAnimal.printNome();
        caixaAnimal.setConteudo(new Cat("Flynn"));
        caixaAnimal.printNome();
    }
}
