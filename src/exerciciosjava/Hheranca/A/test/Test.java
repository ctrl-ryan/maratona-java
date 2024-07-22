package exerciciosjava.Hheranca.A.test;

import exerciciosjava.Hheranca.A.dominio.Animal;
import exerciciosjava.Hheranca.A.dominio.Cachorro;
import exerciciosjava.Hheranca.A.dominio.Gato;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animalEscolhido = null;


        Animal animal = new Animal("animal", 2);
        Gato gato = new Gato("Gatinho", 1);
        Cachorro cachorro = new Cachorro("Cachorrinho", 4);

        animal.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();

    }
}
