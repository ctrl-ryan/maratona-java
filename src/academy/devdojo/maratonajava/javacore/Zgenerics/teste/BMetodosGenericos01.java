package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Animal;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Cat;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Dog;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BMetodosGenericos01 {
    public static void main(String[] args) {
        List<Dog> lista = lista(new Dog());//se eu passo um tipo Dog, ele retornará uma lista do tipo Dog

        List<Carro> carro = lista(new Carro("Mercedes"));//se passo um tipo Carro, retorna uma lista do tipo Carro.

        List<Animal> animals = lista2(new Dog(), new Cat());//usando varargs ele retornará uma lista dos tipos passados.

        List<Object> objects = lista2(new Dog(), new Carro("bmw"));// se os elementos forem diferentes, retornará uma lista de Object.
    }

    //Um método que aceita um objeto de qualquer tipo, e retorna uma lista do tipo do objeto passado como argumento.
    // "<T>" <- diz que o "T" do parâmetro não é uma classe criada.
    private static <T> List<T> lista(T t) {
        return new ArrayList<>(List.of(t));
    }

    //lista que aceita elementos de qualquer tipo, e retorna uma lista dos tipos passados no argumento.
    private static <E> List<E> lista2 (E... es){
        return List.of(es);
    }
}

