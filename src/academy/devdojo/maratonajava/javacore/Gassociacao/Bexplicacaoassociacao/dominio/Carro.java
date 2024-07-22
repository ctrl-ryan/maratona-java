package academy.devdojo.maratonajava.javacore.Gassociacao.Bexplicacaoassociacao.dominio;

public class Carro {
    private String nome;
    private Comprador comprador;

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
