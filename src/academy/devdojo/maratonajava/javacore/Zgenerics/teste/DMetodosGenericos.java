package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Cat;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste.Dog;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.para.exemplos.ClasseA;
import academy.devdojo.maratonajava.javacore.Zgenerics.para.exemplos.ClasseC;

import java.util.List;

public class DMetodosGenericos {
    public static void main(String[] args) {
        List<Dog> dogs = criarListaComRetorno(new Dog());

        criarListaSemRetorno(new Carro("Mercedes"));

        List<List<?>> list = criarListComTresList(new Cachorro(), new Dog(), new Cat());

        List<ClasseA> classesA = criarListaComHeranca(new ClasseC());

    }

    public static <T> List<T> criarListaComRetorno(T t) {
        /*
         Primeiro <T>: Isso declara um tipo genérico T, dizendo ao compilador que T não é uma classe
         específica, mas um tipo desconhecido que será determinado pelo argumento passado para o método.

         List<T>: Isso indica que o método retornará uma lista de objetos do tipo T.

         (T t): Esse é o parâmetro do método, que é um objeto do tipo T.
        */

        List<T> list = List.of(t); //Cria uma lista imutável contendo um único elemento "t".
        return list; //Retorna a lista.
    }

    public static <T> void criarListaSemRetorno(T t) {
        List<T> list = List.of(t);
    }

    public static <T extends ClasseA> List<ClasseA> criarListaComHeranca(T t) {
        List<ClasseA> list = List.of(t);
        return list;
    }

    public static <T, U, V> List<List<?>> criarListComTresList(T t, U u, V v) {
        List<T> tList = List.of(t);
        List<U> uList = List.of(u);
        List<V> vList = List.of(v);

        List<List<?>> list = List.of(tList, uList, vList); //cria uma lista com tres listas de tipos T, U e V.
        return list;
    }
}
