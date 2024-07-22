package exerciciosjava.Aatividadesgeraisdepoo.Batividade.test;

import exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio.Biblioteca;
import exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio.Livro;
import exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio.LivroDigital;

public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984","George Orwell", 1940);
        Livro livro2 = new Livro("Livro B", "Autor B", 2002);

        LivroDigital livrodigital1= new LivroDigital("Livro Digital A",213,"PDF");
        LivroDigital livrodigital2= new LivroDigital("Livro Digital B",213,"PDF");

        livrodigital1.registrarLivro("Livro Digital A", "Autor A", 2023);
        livrodigital2.registrarLivro("Livro Digital B","Autor B",1989);

        Biblioteca biblioteca1 = new Biblioteca(new Livro[]{livro1,livro2,livrodigital1,livrodigital2});

        livrodigital2.getDetalhes();
        System.out.println("=====================");
        biblioteca1.mostrarLivros();

    }
}
