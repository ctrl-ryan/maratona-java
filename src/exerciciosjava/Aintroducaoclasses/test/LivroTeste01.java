package exerciciosjava.Aintroducaoclasses.test;

import exerciciosjava.Aintroducaoclasses.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos.";
        livro.autor = "Aditya Y. Bhargava";
        livro.anoPublicacao = "24 Abril 2017";
        livro.genero = "Educacional";
        livro.preco = 63.75F;

        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.anoPublicacao);
        System.out.println(livro.genero);
        System.out.println("R$" + livro.preco);
    }
}
