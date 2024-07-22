package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        System.out.println(anime.getNome());
        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }

    }
}
