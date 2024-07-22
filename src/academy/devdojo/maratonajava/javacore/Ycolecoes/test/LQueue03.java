package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LQueue03 {

    static class ConsumidorPorNome implements Comparator<Consumidor>{

        @Override
        public int compare(Consumidor o1, Consumidor o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    }

    public static void main(String[] args) {

//Para usar o PriorityQueue deve implementar objetos que possuem Comparable/Comparator. Nesse caso, a classe "Consumidor" não implementa Comparable, então podemos passar um Comparator no construtor de PriorityQueue.

        Consumidor consumidor = new Consumidor("Ryan");
        Queue<Consumidor > fila = new PriorityQueue<>(new ConsumidorPorNome());
        fila.add(consumidor);
    }
}
