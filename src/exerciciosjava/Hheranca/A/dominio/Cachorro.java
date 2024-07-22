package exerciciosjava.Hheranca.A.dominio;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Cachorro late.");
    }

}
