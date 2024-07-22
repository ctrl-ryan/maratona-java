package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaSortByPreco implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.valueOf(manga1.getPreco()).compareTo(manga2.getPreco());
    }
}

class MangaSortByName implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return  o1.getNome().compareTo(o2.getNome());
    }
}

public class DMangaSortTest01 {
    public static void main(String[] args) {


        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2l,"Bersek",29.99));
        mangas.add(new Manga(4l,"Dragon Ball",18.99));
        mangas.add(new Manga(3l,"Black Clover",14.99));
        mangas.add(new Manga(5l,"Chainsaw Man",9.99));
        mangas.add(new Manga(1l,"Yuru Camp",25.99));

        System.out.println("Desordenado:");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("===========================================================================================================================");

        System.out.println("Ordenado por preço:");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("===========================================================================================================================");

        System.out.println("Ordenado por ID reverso:");
        Collections.sort(mangas,new MangaSortByPreco().reversed());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("===========================================================================================================================");

        System.out.println("Ordenado por nome:");
//        Collections.sort(mangas,new MangaSortByString());
        mangas.sort(new MangaSortByName());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}

