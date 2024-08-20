package academy.devdojo.maratonajava.javacore.ZZClambdas;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;
import com.sun.jdi.IntegerType;

import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

public class ALambdas01 {
    public static void main(String[] args) {

    //Aqui, em classes anônimas, estou criando uma instância de uma classe que implementa a interface Predicate, essa instância está sendo referenciada pela própria interface Predicate.

        Predicate<Integer> integerPredicate1 = new Predicate<>() {
            @Override
            public boolean test(Integer inteiro) {
                return inteiro.equals(10);
            }
        };

    //Posso fazer o mesmo com classes anônimas:

        Predicate<Integer> integerPredicate2 = (Integer inteiro) -> inteiro.equals(10);


    //Isso é útil, pois, alguns métodos necessitam de uma interface para funcionar. E para nao precisar criar uma classe, implementar a interface, sobrescrever seu método principal e instanciar, eu posso apenas criar diretamente uma instância de uma classe que implemente sua interface e sobrescreva seu método principal de maneira simples.

        //Exemplo de método que precisa de uma interface funcional (nesse caso Predicate):

        teste(integerPredicate1);
        teste(integerPredicate2);

//-----------------------------------------------------------------------------------------------------------------

        //Maneira não simplificada dos lambdas:

        Predicate<Integer> predicate1 = (Integer inteiro) ->{
            return inteiro.equals(4);
        };

        //Maneira simplificada:

        Predicate<Integer> predicate2 = inteiro -> inteiro.equals(10);


        //!ADENDO: Lambdas só funcionam para interfaces funcionais. Quando um método pede uma interface funcional como argumento, a sua lambda deve implementar exatamente o que interface que o método pede faz.
    }

    public static <T> void teste (Predicate<T> predicate){}

}
