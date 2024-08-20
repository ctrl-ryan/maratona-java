package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DFunction01 {
    //Função que receba uma String e retorne-a como um Integer
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Ryan", "Souza", "Rodrigues"));
        List<String> numbers = new ArrayList<>(List.of("123", "45324", "1231"));

        //Usando method references:
        Function<String, Integer> function = Integer::valueOf;

        //Usando lamdas:
        Function<String, Integer> function1 = s -> Integer.valueOf(s);

        //Usando classes anônimas:
        new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Integer integer = function.apply("19082024");

    }

}
