package academy.devdojo.maratonajava.javacore.ZZClambdas;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ECollectionsComLambdas01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(2l,"Bersek",29.99,0));
        mangas.add(new Manga(4l,"Dragon Ball",18.99,5));
        mangas.add(new Manga(3l,"Black Clover",14.99,0));
        mangas.add(new Manga(5l,"Chainsaw Man",9.99,2));
        mangas.add(new Manga(1l,"Yuru Camp",25.99,0));

        //Aqui será ordenado por ID, pois a classe mangá já implementa um Comparable que faz isso.
        Collections.sort(mangas);
        mangas.forEach(System.out::println);

        System.out.println("=============================================================================================");

        //Aqui será ordenado por Nome, pois implementei um lambda que substitui uma classe que implementa Comparable.
        Collections.sort(mangas,(m1,m2) -> m1.getNome().compareTo(m2.getNome()));
        mangas.forEach(System.out::println);


    }
}
