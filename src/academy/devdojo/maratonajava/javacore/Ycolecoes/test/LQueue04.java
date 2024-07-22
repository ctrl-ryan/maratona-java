package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class LQueue04 {
    public static void main(String[] args) {

        //Com o PriorityQueue, eu posso definir com que prioridade eu desejo trabalhar. Posso dar prioridade à quem chegou primeiro, à quem é mais caro, etc. Para definir a prioridade, eu posso passar um Comparator no construtor de PriorityQueue.

        //Nesse caso, estou usando a prioridade "Sair primeiro quem é mais caro":

        Queue <Manga> lista = new PriorityQueue<>(new MangaSortByPreco().reversed());
        lista.add(new Manga(2l,"Bersek",29.99));
        lista.add(new Manga(4l,"Dragon Ball",18.99));
        lista.add(new Manga(3l,"Black Clover",14.99));
        lista.add(new Manga(5l,"Chainsaw Man",9.99));
        lista.add(new Manga(1l,"Yuru Camp",25.99));

        while (!lista.isEmpty()){
            System.out.println(lista.poll());
        }

    }
}
