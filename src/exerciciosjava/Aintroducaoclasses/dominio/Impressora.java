package exerciciosjava.Aintroducaoclasses.dominio;

public class Impressora {
    public void imprimaLivro(Livro livro){

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(livro.titulo);
        System.out.println(livro.anoPublicacao);
        System.out.println(livro.autor);
        System.out.println(livro.genero);
        System.out.println("R$ " + livro.preco);
    }
}
