package exerciciosjava.NPolimorfismo.Aentendendo.domain;

public class Gato extends Animal{

    public String gatoPulouMuro(){
        return "o gato pulou o muro";
    }

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public boolean vacinado() {
        return false;
    }

    @Override
    public String fazerSom() {
        return  "miau miau miau";
    }
}


