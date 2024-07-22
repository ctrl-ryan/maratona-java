package academy.devdojo.maratonajava.javacore.Isobreescrita.dominio;

public class Anime extends Object {
    protected String nome;

    public Anime(String nome){
        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void teste(){
        getClass().getName();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
