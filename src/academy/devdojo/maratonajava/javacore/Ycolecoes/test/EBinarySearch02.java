package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EBinarySearch02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1l, "Yuru Camp", 25.99));
        mangas.add(new Manga(2l, "Bersek", 29.99));
        mangas.add(new Manga(3l, "Black Clover", 14.99));
        mangas.add(new Manga(4l, "Dragon Ball", 18.99));
        mangas.add(new Manga(5l, "Chainsaw Man", 9.99));

        Collections.sort(mangas);//Sort padrão: por ID.

        Manga mangaToSearch = new Manga(10l, "Yakusoku no Neverland", 39.99);

        System.out.print("BinarySearch mangas por ID: ");

        System.out.print(Collections.binarySearch(mangas, new Manga(5l, "Chainsaw Man",9.99))+ " ");
        System.out.println(Collections.binarySearch(mangas,mangaToSearch));

    }
}
