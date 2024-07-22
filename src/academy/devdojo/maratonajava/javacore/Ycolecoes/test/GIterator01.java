package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class GIterator01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(2l,"Bersek",29.99,0));
        mangas.add(new Manga(4l,"Dragon Ball",18.99,5));
        mangas.add(new Manga(3l,"Black Clover",14.99,0));
        mangas.add(new Manga(5l,"Chainsaw Man",9.99,2));
        mangas.add(new Manga(1l,"Yuru Camp",25.99,0));

        System.out.print("Antes do iterator: ");
        for (Manga manga : mangas) {
            System.out.printf("%s, ",manga.getNome());
        }


        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0) mangaIterator.remove();
        }

        //ou dessa maneira:
        //mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.print("\n\nApós o iterator: ");
        for (Manga manga : mangas) {
            System.out.printf("%s, ",manga.getNome());
        }


    }
}
