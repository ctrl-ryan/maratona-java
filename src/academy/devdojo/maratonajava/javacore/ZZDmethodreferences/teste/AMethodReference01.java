package academy.devdojo.maratonajava.javacore.ZZDmethodreferences.teste;

import academy.devdojo.maratonajava.javacore.ZZDmethodreferences.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZDmethodreferences.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class AMethodReference01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Nanatsu", 108), new Anime("Naruto", 788), new Anime(
                "Dragon Ball",
                282)));

        animes.sort((anime1,anime2) -> anime1.getTitle().compareTo(anime2.getTitle()));

//posso implementar a lógica "anime1.getTitle().compareTo(anime2.getTitle())" como um método de alguma classe, e chamar o método dessa classe usando method reference:

        animes.sort(AnimeComparators::compareByTitle);


    }
}
