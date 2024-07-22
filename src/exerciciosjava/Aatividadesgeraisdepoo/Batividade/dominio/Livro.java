package exerciciosjava.Aatividadesgeraisdepoo.Batividade.dominio;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicado;
    protected final int id;
    protected static int contador;

    {
        id = ++contador;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor) {
        this(titulo);
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicado) {
        this(titulo,autor);
        this.anoPublicado = anoPublicado;
    }

    @Override
    public String  toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                ", id=" + id +
                '}';
    }

    public void registrarLivro(String titulo){
        this.titulo = titulo;
    }

    public void registrarLivro(String titulo ,String autor){
        registrarLivro(titulo);
        this.autor = autor;
    }

    public void registrarLivro(String titulo ,String autor, int anoPublicado){
        registrarLivro(titulo,autor);
        this.anoPublicado= anoPublicado;
    }

    public void getDetalhes(){
        System.out.println("=========================");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano publicado: " + this.anoPublicado);
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public int getQuantidadeLivro() {
        return contador;
    }

}
