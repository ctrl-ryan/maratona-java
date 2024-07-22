package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class INavigableSet01 {
    public static void main(String[] args) {
//=====================================================================================================
//NavigableSet estende de SortedSet que estende de Set, ou seja, NavigableSet também é um Set, porém, com métodos a mais que usam a ordenação das classes. Ou seja, para usar o NavigableSet a classe implementada necessita ser ordenada de alguma maneira.

//Os elementos da coleção que usam TreeSet necessitam ter um Comparable, e caso nao tenham, você pode passar um Comparator como argumento do construtor do TreeSet. TreeSet nao usa equals(); nem hashcode(); para verificar se dois elementos são iguais, e sim o Comparator/Comparable.
//=====================================================================================================

    //Passando um comparator, pois a classe Smartphone não possui um Comparable:

        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneMarcaComparator());
        smartphones.add(new Smartphone("123", "Samsung"));
        smartphones.add(new Smartphone("1234", "Nokia"));
        smartphones.add(new Smartphone("1235", "Xiaomi"));
        smartphones.add(new Smartphone("1236", "Apple"));
        smartphones.add(new Smartphone("1237", "Huawei"));



        System.out.println("Smartphones: ");
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }


        //Passando uma classe que já implementa Comparable:

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(2l,"Bersek",29.99));
        mangas.add(new Manga(4l,"Dragon Ball",18.99));
        mangas.add(new Manga(3l,"Black Clover",14.99));
        mangas.add(new Manga(5l,"Chainsaw Man",9.99));
        mangas.add(new Manga(1l,"Yuru Camp",25.99));

        System.out.println("Mangás:");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
