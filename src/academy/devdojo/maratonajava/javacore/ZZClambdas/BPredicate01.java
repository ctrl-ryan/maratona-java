package academy.devdojo.maratonajava.javacore.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BPredicate01 {
    public static void main(String[] args) {
//*A interface Predicate é uma interface funcional que precisa de alguma condição que retorna um valor booleano.

        //Chamando o método filter, passando uma lista de integer e uma classe que implementa predicate e sobrescreva seu método com a condição "se maior que 5, retornar true", em forma de lambda.
        List<Integer> integerList = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> maiorQueCinco = filter(integerList, inteiro -> inteiro >= 5);
        System.out.println(maiorQueCinco);

        //Chamando o método filter, passando uma lista de strings e uma classe que implementa Predicate e sobrescreva seu método com a condição "se igual à "olá", retornar true".
        List<String> stringList = new ArrayList<>(List.of("Olá", "Bom dia", "Como vai?"));
        List<String> olá = filter(stringList, palavra -> palavra.equalsIgnoreCase("olá"));


    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filtered.add(t);
            }
        }
        return filtered;
    }

}
