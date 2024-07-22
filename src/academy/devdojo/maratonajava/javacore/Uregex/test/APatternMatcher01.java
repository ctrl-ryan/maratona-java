package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APatternMatcher01 {
    public static void main(String[] args) {
//===========================================================================
//Expressões regulares, também conhecidas como regex ou regexp, são padrões de texto que descrevem conjuntos de strings. Elas são utilizadas principalmente para busca e manipulação de texto em grandes volumes de dados ou em operações onde é necessário identificar padrões específicos.


    //Criação do que eu quero achar em um texto, e o texto:


        String regex = "ryan";//O que eu quero encontrar em um texto.
        String text = "ryannaynryanryan";//O texto.

    //Criação do padrão: (Pattern é o padrão que você quer achar em um texto, otimizado pelo sistema para buscas rápidas e eficientes.)

        Pattern pattern = Pattern.compile(regex);

    //Criando método para encontrar o padrão em algum texto:

        Matcher matcher = pattern.matcher(text);//retorna um tipo Matcher.



        System.out.println("Texto: " + text);
        System.out.println("Regex: " + regex);
        System.out.print("Posições encontradas: " );

        //matcher.find() -> procura pela próxima ocorrência do padrão no texto. Retorna true se achar uma correspondência, e false se nao encontrar nenhuma.

        //matcher.start(); -> retorna a posição inicial do último match encontrado pelo Matcher

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }


    }
}
