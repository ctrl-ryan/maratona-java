package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

public class HSet01 {
    public static void main(String[] args) {
//=============================================================================================================
    //Set: Representa uma coleção que não permite elementos duplicados
    //Algumas Classes que implementam Set: HashSet, LinkedHashMap, TreeSet.
//=============================================================================================================

    //HashSet (Classe que implementa Set)
    //Sem ordem de inserção, apenas elementos únicos, e sem index:

        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1l,"Yuru Camp",25.99));
        mangas.add(new Manga(1l,"Yuru Camp",25.99));
        mangas.add(new Manga(2l,"Bersek",29.99));
        mangas.add(new Manga(3l,"Black Clover",14.99));
        mangas.add(new Manga(4l,"Dragon Ball",18.99));
        mangas.add(new Manga(5l,"Chainsaw Man",9.99));

        System.out.print("Sem ordem de inserção: ");
        for (Manga manga : mangas) {
            System.out.printf("%s, ",manga.getNome());
        }

    //LinkedHashSet (Classe que implementa Set)
    //Mesma coisa que o HashSet, porém possui ordem de inserção:

        Set<Manga> mangaLinkedHashSet = new LinkedHashSet<>();
        mangaLinkedHashSet.add(new Manga(1l,"Yuru Camp",25.99));
        mangaLinkedHashSet.add(new Manga(2l,"Bersek",29.99));
        mangaLinkedHashSet.add(new Manga(3l,"Black Clover",14.99));
        mangaLinkedHashSet.add(new Manga(4l,"Dragon Ball",18.99));
        mangaLinkedHashSet.add(new Manga(5l,"Chainsaw Man",9.99));
        mangaLinkedHashSet.add(new Manga(5l,"Chainsaw Man",9.99));

        System.out.print("\n\nCom ordem de inserção: ");
        for (Manga manga : mangaLinkedHashSet) {
            System.out.printf("%s, ",manga.getNome());
        }


    }
}
