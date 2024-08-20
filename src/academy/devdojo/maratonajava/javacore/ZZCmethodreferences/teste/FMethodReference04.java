package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;

import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FMethodReference04 {
    //to reference a constructor
    public static void main(String[] args) {
//Referenciar construtores em Java com method references é uma maneira de criar objetos de forma concisa e legível. Quando você usa method references para referenciar um construtor, está basicamente dizendo ao Java para criar uma nova instância de uma classe específica usando o construtor correspondente.

        //Usando Method Reference:
        Supplier<AnimeComparators> animeComparatorsSupplier1 = AnimeComparators::new;

        //Usando Lambda:
        Supplier<AnimeComparators> animeComparatorsSupplier2 = () -> new AnimeComparators();

        //Usando classes anônimas:
        Supplier<AnimeComparators> animeComparatorsSupplier3 = new Supplier<AnimeComparators>() {
            @Override
            public AnimeComparators get() {
                return new AnimeComparators();
            }
        };

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Nanatsu", 108), new Anime("Naruto", 788), new Anime("Dragon Ball", 282)));

        //usando a instância do supplier como argumento para ordenar a lista de animes:
        animes.sort(animeComparatorsSupplier1.get()::compareByTitleNonStatic);
    }
}
