package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public void imprima(){
        System.out.println("-----------------------------------------");
        System.out.println("Nome: " + this.nome);
        this.endereco.imprima();
        System.out.println("-----------------------------------------");
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, Endereco endereco) {
        this(nome);
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
}
