package exerciciosjava.Aintroducaoclasses.dominio;

public class Livro {
    public String titulo;
    public String autor;
    public String anoPublicacao;
    public String genero;
    public float preco;

    public void imprimir(){
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(this.titulo);
        System.out.println(this.anoPublicacao);
        System.out.println(this.autor);
        System.out.println(this.genero);
        System.out.println("R$ " + this.preco);
    }
}
