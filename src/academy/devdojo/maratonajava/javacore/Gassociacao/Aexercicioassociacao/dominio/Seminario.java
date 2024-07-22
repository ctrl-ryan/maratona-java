package academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public void imprima(){
        System.out.println("Título: " + this.titulo);
        if(alunos == null) return;
        System.out.println("Local: " + local.getEndereco());
        System.out.print("Alunos: ");
        for (Aluno aluno: alunos){
            System.out.println(" " + aluno.getNome() );
        }
        System.out.println(" ");
    }

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
