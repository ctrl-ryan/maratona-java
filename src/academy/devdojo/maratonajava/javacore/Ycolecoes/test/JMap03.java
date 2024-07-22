package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JMap03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Jusé");
        Consumidor consumidor2 = new Consumidor("Bernadito");

        Manga manga1 = new Manga(1l, "Yuru Camp", 25.99);
        Manga manga2 = new Manga(2l, "Bersek", 29.99);
        Manga manga3 = new Manga(3l, "Black Clover", 14.99);
        Manga manga4 = new Manga(4l, "Dragon Ball", 18.99);
        Manga manga5 = new Manga(5l, "Chainsaw Man", 9.99);


        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, Arrays.asList(manga1, manga2, manga4));
        consumidorMangaMap.put(consumidor2, Arrays.asList(manga5, manga3));


        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry : consumidorMangaMap.entrySet()) {
            System.out.println("Consumidor: " + consumidorListEntry.getKey().getNome());
            System.out.println("Mangá(s) comprado(s):");
            for (Manga manga : consumidorListEntry.getValue()) {
                System.out.println("-" + manga.getNome());
            }
            System.out.println();
        }


    }
}
