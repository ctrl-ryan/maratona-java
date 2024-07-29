package academy.devdojo.maratonajava.javacore.Zgenerics.service;

public class Caixa<T> {
    T conteudo;

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void printConteudo() {
        System.out.println(conteudo);
    }
}
