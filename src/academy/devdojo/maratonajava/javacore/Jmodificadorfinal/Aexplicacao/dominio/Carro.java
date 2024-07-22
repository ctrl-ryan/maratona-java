package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Aexplicacao.dominio;

public class Carro {
    private String nome;
    public final static double VELOCIDADE_LIMITE = 250;
    public final static Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
