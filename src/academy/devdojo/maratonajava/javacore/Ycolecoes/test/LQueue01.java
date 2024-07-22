package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class LQueue01 {
    public static void main(String[] args){
/*--------------------------------------------------------------------------------------------------------
 Queue é uma interface que define uma coleção de elementos organizada de acordo com a ordem de inserção ou de acordo com um critério de prioridade. Existem diferentes implementações da interface Queue, e cada uma pode organizar os elementos de forma distinta:

FIFO (First-In-First-Out): Quando usada com a classe LinkedList ou ArrayDeque, a Queue segue o modelo FIFO, onde o elemento que foi inserido primeiro é o primeiro a ser removido. Nesse caso, a ordem de processamento dos elementos é a mesma da ordem de inserção.

Prioridade: Quando usada com a classe PriorityQueue, a Queue organiza os elementos com base em suas prioridades, que podem ser determinadas pelo método compareTo do objeto (se ele implementar Comparable) ou por um Comparator fornecido. A ordem de processamento dos elementos é determinada pela prioridade, e não pela ordem de inserção.
 ------------------------------------------------------------------------------------------------------*/
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
