package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class INavigableSet02 {
    public static void main(String[] args) {
//============================================================================================================
//Explorando os métodos da interface NavigableSet
//============================================================================================================

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(2l, "Bersek", 29.99));
        mangas.add(new Manga(4l, "Dragon Ball", 18.99));
        mangas.add(new Manga(3l, "Black Clover", 14.99));
        mangas.add(new Manga(5l, "Chainsaw Man", 9.99));
        mangas.add(new Manga(1l, "Yuru Camp", 25.99));


        Manga kimetsuNoYaiba = new Manga(12L, "Kimetsu no Yaiba", 21.99);

        System.out.println("Sobre: Kimetsu no Yaiba, preço R$21,99\n");
        System.out.println("Com base no preço...");
        System.out.println("Quem é imediatamente mais caro: " + mangas.higher(kimetsuNoYaiba).getNome());
        System.out.println("Quem é imediatamente mais barato: " + mangas.lower(kimetsuNoYaiba).getNome());
        System.out.println("Quem é igual, ou mais barato: " + mangas.floor(kimetsuNoYaiba).getNome());
        System.out.println("Quem é igual, ou mais caro: " + mangas.ceiling(kimetsuNoYaiba).getNome());

        System.out.println("-----------------------------------------------------------------------------");

        System.out.print("Removendo o mais barato: ");
        System.out.println(mangas.pollFirst().getNome());
        System.out.print("Removendo o mais caro: ");
        System.out.println(mangas.pollLast().getNome());

        System.out.println("Lista após a remoção: ");
        for (Manga manga : mangas) {
            System.out.println("- " + manga.getNome());
        }


    }
}
