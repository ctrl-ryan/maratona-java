package exerciciosjava.Gassociacao.Bexercicio.dominio;

public class Curso {
    private String nome;
    private Aluno[] alunos;

    public Curso(String nome) {
        this.nome = nome;
    }

    public void imprima(){
        System.out.println("Nome: " + nome);
        imprimaAlunos();
    }

    public void imprimaAlunos() {
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
