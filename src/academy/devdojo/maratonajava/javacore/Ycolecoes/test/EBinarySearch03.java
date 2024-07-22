package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EBinarySearch03 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1l, "Yuru Camp", 25.99));
        mangas.add(new Manga(2l, "Bersek", 29.99));
        mangas.add(new Manga(3l, "Black Clover", 14.99));
        mangas.add(new Manga(4l, "Dragon Ball", 18.99));
        mangas.add(new Manga(5l, "Chainsaw Man", 9.99));

        MangaSortByPreco ordenacaoPreco = new MangaSortByPreco();
        mangas.sort(ordenacaoPreco);
        //ChainsawMan, BlackClover, DragonBall, YuruCamp, Bersek <- Ordem por preço

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga chainsawMan = new Manga(5l, "Chainsaw Man", 9.99);
        Manga drStone = new Manga(8l, "Dr.Stone", 13.99);

        System.out.println("BinarySearch por preço:");
        System.out.print(Collections.binarySearch(mangas,chainsawMan,ordenacaoPreco) + " ");
        System.out.println(Collections.binarySearch(mangas,drStone,ordenacaoPreco));


    }
}
