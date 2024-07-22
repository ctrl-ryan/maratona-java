package exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio;

import javax.xml.transform.Source;
import java.util.Arrays;

public class Biblioteca {
    private Livro[] livros;
    private int quatidadeLivros;

    public Biblioteca() {
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "livros=" + Arrays.toString(livros) +
                '}';
    }

    public void mostrarLivros() {
        System.out.println("Livros da Biblioteca: ");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + ", por " + livro.getAutor());
        }
        if (livros != null) {
            System.out.print("Total de livros na biblioteca: ");
            for (int i = 0; i < livros.length; i++) {
                i = i++;
                quatidadeLivros = i;
            }
            System.out.println(quatidadeLivros);
        }
    }

    public Biblioteca(Livro[] livros) {
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
