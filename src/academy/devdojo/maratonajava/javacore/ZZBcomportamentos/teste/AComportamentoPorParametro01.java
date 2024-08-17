package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.teste;





import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AComportamentoPorParametro01 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(4,5,7,9,3,2,2,4,5,8,8,3,2));
        List<String> stringList = new ArrayList<>(List.of("Olá", "Bom dia"));
        List<Character> characterList = new ArrayList<>(List.of('A','B','C'));

//No método eu aceito uma lista e um Predicate. Para usar o predicate eu poderia fazer igual eu fazia com as coleções TreeSet, passando uma classe que implementava Comparator e sobrescrevia seu método principal. Mas uma maneira mais simples do que criar uma classe para cada maneira que eu desejo implementar o método, é criar uma classe anônima.

        //Classe anônima para filtrar em uma lista de Integers.
        filter(integerList, new Predicate<Integer>() {
            @Override
            public boolean test(Integer inteiro) {
                return inteiro.equals(4);
            }
        });

        //Classe anônima para filtrar em uma lista de Strings.
        filter(stringList, new Predicate<String>() {
            @Override
            public boolean test(String palavra) {
                return palavra.equalsIgnoreCase("bom dia");
            }
        });

        //Classe anônima para filtrar em uma lista de caracteres.
        filter(characterList, new Predicate<Character>() {
            @Override
            public boolean test(Character caractere) {
                return caractere.equals('b');
            }
        });

    /*Podemos também usar lambdas. Para usar lambdas, lembre-se que você está nada mais e nada menos, do que criando uma classe anônima igual as acima, só que de uma maneira mais simples

    Ao usar classes anônimas, sobrescrevemos o método de alguma classe, ou de uma interface. Quando fazemos isso, podemos mudar o nome da variável do parâmetro do método da classe original. E em lambdas nao é diferente, nós podemos dar o nome que quiser para a variável desse parâmetro. */

        filter(integerList, inteiro -> inteiro.equals(5));//dei o nome da variável do parâmetro de "inteiro".

        filter(stringList, palavra -> palavra.equalsIgnoreCase("bom dia"));

        filter(characterList, caractere -> caractere.equals('c'));

    //! Como o java sabe que esse lambda é uma implementação de Predicate?
    //O java sabe que isso é uma implementação de Predicate, pois o segundo argumento do método "filter" é um Predicate, que é uma interface funcional (interface que possui apenas um método abstrato). O tipo <T> do método será referido como um tipo Integer (pois você está passando uma lista de Integer para o List<T>), e ele também sabe que a condição que você passou deve retornar um valor booleano, pois o método abstrato da interface funcional Predicate DEVE retornar um valor booleano.

    }

    //Método que necessita de uma lista e uma classe que implementa Predicate, ou uma classe anônima, ou um lambda.
    public static <T> List<T> filter(List<T> list, Predicate<T> predicateCar) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if (predicateCar.test(t)) {
                filtered.add(t);
            }
        }
        return filtered;
    }


}
