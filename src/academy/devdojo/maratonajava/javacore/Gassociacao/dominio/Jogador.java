package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    public String nome;
    public Time time;

    public void imprima(){
        System.out.println("Nome: " + this.nome);
        if(time == null){return;}
        System.out.println("Time: " + time.getNome());
        System.out.println("-------------------------------");
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public Jogador(String nome, Time time){
        this(nome);
        this.time = time;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public Time getTime(){
        return this.time;
    }

}
