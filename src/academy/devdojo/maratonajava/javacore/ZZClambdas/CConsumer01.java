package academy.devdojo.maratonajava.javacore.ZZClambdas;

import java.util.List;
import java.util.function.Consumer;

public class CConsumer01 {


    public static void main(String[] args) {
//* A interface Consumer é uma interface funcional que nao possui retorno.


        List<String> strings = List.of("oi", "tchau", "iai");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Character> characters = List.of('a', 'b', 'c', 'd', 'e');


        //chamando o método printSize, passando uma lista de string e uma classe que implementa a interface Consumer, sobrescrevendo seu método de uma maneira que itere e imprima o tamanho de cada string dentro da lista.
        printSize(strings, lista -> {
            System.out.print("Tamanho de cada string: ");
            for (String string : lista) {
                System.out.print(string.length() + " ");
            }
        });

        //Chamando printSize, passando uma lista de integers e um lambda que sobrescreva o método principal de Consumer, de uma maneira que itere sobre a lista de integers e imprima os inteiros maiores que 3.
        printSize(integers, lista -> {
            System.out.print("\nIntegers maiores que três: ");
            for (Integer integer : lista) {
                if (integer > 3) {
                    System.out.print(integer + " ");
                }
            }
        });

        //Chamando printSize, e usando lambda para sobrescrever o método "accept" da interface funcional Consumer de uma maneira que itere sobre a lista de caracteres e imprima os caracteres com bytes maiores que 99.
        printSize(characters, lista -> {
            System.out.print("\nCaracteres com o byte maiores que noventa-e-nove: ");
            for (Character c : lista) {
                if (c > 99) {
                    System.out.print(c + " ");
                }
            }
        });
    }

    //Lista que aceita uma lista de qualquer tipo, e um consumer que aceita uma lista de qualquer tipo.
    public static <T> void printSize(List<T> list, Consumer<List<T>> consumer) {
        consumer.accept(list);//Método accept aceita uma lista. Posso sobrescrever esse método com um lambda.
    }
}
