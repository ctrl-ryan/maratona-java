package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida!");
        } else {
            this.idade = idade;
        }
    }

    public void mostrarNome() {
        System.out.println(this.nome);
    }

    public void mostrarIdade(){
        System.out.println(this.idade);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}

