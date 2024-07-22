package exerciciosjava.Gassociacao.Aexercicio.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private Carro carro;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprima(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.carro);
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
