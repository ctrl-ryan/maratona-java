package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.services;

import academy.devdojo.maratonajava.javacore.ZZCmethodreferences.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public int compareByTitleNonStatic(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

}
