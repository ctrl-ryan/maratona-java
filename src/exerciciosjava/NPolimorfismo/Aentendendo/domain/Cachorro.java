package exerciciosjava.NPolimorfismo.Aentendendo.domain;

public class Cachorro extends Animal {

    public String pegarBolinha(){
        return "Cachorro foi pegar a bolinha.";
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public boolean vacinado() {
        return true;
    }

    @Override
    public String fazerSom() {
        return "au au au";
    }
}
