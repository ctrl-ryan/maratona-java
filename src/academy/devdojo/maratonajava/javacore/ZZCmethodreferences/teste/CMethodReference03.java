package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CMethodReference03 {
//Method Reference com método de instância (não estático), mas sem um objeto criado.
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ryan", "Ronaldo", "Pietro", "Enzo"));

        //Usando Method Reference:
        names.sort(String::compareTo);

        //Usando Lambda:
        names.sort((a,b) -> a.compareTo(b));

        //Usando classes anônimas:

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


//============================================================================================================================
//Outro exemplo: Receber uma String e retorna-la em Integer.

        List<String> stringNumbers = new ArrayList<>(List.of("3123", "123124", "5456"));

        //Usando Method Reference:
        Function <String,Integer> function1 = Integer::valueOf;

        //Usando Lambda:
        Function<String,Integer> function2 = string -> Integer.valueOf(string);


        Integer integer = function1.apply("81032");

    }
}
