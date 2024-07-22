package exerciciosjava.Aintroducaoclasses.test;

import exerciciosjava.Aintroducaoclasses.dominio.Impressora;
import exerciciosjava.Aintroducaoclasses.dominio.Livro;

public class LivroTeste02 {
    public static void main(String[] args) {
        
        Impressora impressora = new Impressora();

        Livro livro1 = new Livro();
        
        livro1.titulo = "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos.";
        livro1.autor = "Aditya Y. Bhargava";
        livro1.anoPublicacao = "24 Abril 2017";
        livro1.genero = "Educacional";
        livro1.preco = 63.75F;
        
        impressora.imprimaLivro(livro1);
        
    }
}
