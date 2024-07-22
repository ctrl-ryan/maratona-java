package exerciciosjava.Dconstrutores.dominio;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        double media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public boolean isAprovado(){
        return calcularMedia() > 7;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
