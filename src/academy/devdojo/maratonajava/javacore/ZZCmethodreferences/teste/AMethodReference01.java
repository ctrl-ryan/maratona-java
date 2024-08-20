package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;

import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AMethodReference01 {
    //Method Reference com métodos estáticos:
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Nanatsu", 108), new Anime("Naruto", 788), new Anime("Dragon Ball", 282)));

        //Usando method reference:
        animes.sort(AnimeComparators::compareByTitle);

        //Usando lambda:
        animes.sort((a1,a2)-> AnimeComparators.compareByTitle(a1,a2));

        //Usando classes anonimas:
        animes.sort(new Comparator<Anime>() {
            @Override
            public int compare(Anime a1, Anime a2) {
                return AnimeComparators.compareByTitle(a1,a2);
            }
        });



    //É como se eu tivesse fazendo a implementação do método principal da interface funcional chamando a lógica de outra classe, que no caso é AnimeComparators. Como a lógica de tudo é delegado a um método, eu nao preciso usar uma expressão que nomeie as variáveis, como o uso de lambdas; eu posso simplesmente usar o method reference.
    }
}
