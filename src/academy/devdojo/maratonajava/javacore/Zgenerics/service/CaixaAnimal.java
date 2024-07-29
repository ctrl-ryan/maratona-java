package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Animal;

public class CaixaAnimal<T extends Animal> {
    T conteudo;

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void printNome(){
        System.out.println("Nome: " + this.conteudo.getName());
    }
}
