package academy.devdojo.maratonajava.javacore.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DFunction01 {
    public static void main(String[] args) {
    //*Function é uma interface funcional que recebe um tipo <T> e retorna um tipo <R>. Você define os tipos ao criar uma instância de uma classe na hora em que implementa Function com lambdas, ou, se for passado diretamente pro método, ele saberá pelo tipo do argumento.

        List<String> strings = List.of("1232383");

        //Chamando o método conversor, passando uma lista de strings, e uma classe que implementa function, sobrescrevendo seu método apply para converter uma string para um Integer (Usando lambdas).
        List<Integer> conversor = conversor(strings, palavra -> Integer.valueOf(palavra));

        System.out.println(conversor);


    }

    public static <T, R> List<R> conversor(List<T> list, Function<T, R> function) {
        List<R> convertido = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            convertido.add(r);
        }
        return convertido;
    }

}
