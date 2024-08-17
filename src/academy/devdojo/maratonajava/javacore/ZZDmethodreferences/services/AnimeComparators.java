package academy.devdojo.maratonajava.javacore.ZZDmethodreferences.services;

import academy.devdojo.maratonajava.javacore.ZZDmethodreferences.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }
    public static int compareByTitledssd(Anime anime1, Anime anime2, Anime anime3){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

}
