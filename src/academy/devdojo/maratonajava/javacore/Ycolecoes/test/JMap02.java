package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JMap02 {
    public static void main(String[] args) {


//Associando consumidores com seus respectivos produtos:

        ///Consumidores:
        Consumidor consumidor1 = new Consumidor("Jusé");
        Consumidor consumidor2 = new Consumidor("Bernadito");

        ///Produtos:
        Manga manga1 = new Manga(1l, "Yuru Camp", 25.99);
        Manga manga2 = new Manga(2l, "Bersek", 29.99);
        Manga manga3 = new Manga(3l, "Black Clover", 14.99);
        Manga manga4 = new Manga(4l, "Dragon Ball", 18.99);
        Manga manga5 = new Manga(5l, "Chainsaw Man", 9.99);

        ///Associando consumidores à produtos:
        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2,manga5);


        for (Map.Entry<Consumidor , Manga> consumidorMangaEntry: consumidorMangaMap.entrySet()){
            System.out.printf("Consumidor: %s \nMangá: %s%n\n",consumidorMangaEntry.getKey().getNome(),consumidorMangaEntry.getValue().getNome());
        }


    }
}
