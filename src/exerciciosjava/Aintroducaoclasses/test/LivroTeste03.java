package exerciciosjava.Aintroducaoclasses.test;

import exerciciosjava.Aintroducaoclasses.dominio.Livro;

public class LivroTeste03 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Entendendo Algoritmos: Um Guia Ilustrado.";
        livro.autor = "Aditya Y. Bhargava";
        livro.anoPublicacao = "24 Abril 2017";
        livro.genero = "Educacional";
        livro.preco = 63.75F;

        livro.imprimir();
    }
}
