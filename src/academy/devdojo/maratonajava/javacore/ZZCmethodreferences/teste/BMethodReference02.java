package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;
import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BMethodReference02 {
//Method Reference com métodos de instância (nao estáticos).
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Nanatsu", 108), new Anime("Naruto", 788), new Anime("Dragon Ball", 282)));

        //Usando method reference:
        animes.sort(new AnimeComparators()::compareByTitleNonStatic);

        //Usando lambda:
        animes.sort((a1,a2)-> new AnimeComparators().compareByTitleNonStatic(a1,a2));

        //Usando classes anônimas:
        animes.sort(new Comparator<Anime>() {
            @Override
            public int compare(Anime a1, Anime a2) {
                return new AnimeComparators().compareByTitleNonStatic(a1,a2);
            }
        });



        //ou:

        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByTitleNonStatic);

    }
}
