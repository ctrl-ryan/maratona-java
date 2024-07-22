package academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprima(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminario==null) return;
        System.out.print("Seminários à fazer:");
        System.out.println(seminario.getTitulo());
        System.out.println(" ");
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome,idade);
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
