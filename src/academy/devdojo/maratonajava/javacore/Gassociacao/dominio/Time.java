package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    public String nome;
    public Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public void imprima(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for(Jogador jogador: jogadores){
            System.out.println(jogador.getNome());
        }
        System.out.println("-------------------------------");
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores(){
        return this.jogadores;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
