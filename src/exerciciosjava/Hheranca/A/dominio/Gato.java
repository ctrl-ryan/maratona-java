package exerciciosjava.Hheranca.A.dominio;

public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato mia.");
    }
}