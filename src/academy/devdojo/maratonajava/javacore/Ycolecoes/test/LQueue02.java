package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class LQueue02 {
    public static void main(String[] args){

        Queue<String> fila = new PriorityQueue<>();

        fila.add("C");
        fila.add("A");
        fila.add("B");
        fila.add("F");
        fila.add("D");
        fila.add("E");

    //Métodos:

        fila.add("G"); //-> Adiciona o elemento à fila. Se a fila está cheia, pode lançar uma exceção.

        fila.offer("G"); //-> tenta adicionar o elemento à fila e retorna true se foi adicionado com sucesso, ou false se a fila está cheia.

        fila.remove();//-> Remove e retorna o elemento que entrou primeiro. Lança uma exceção se a fila estiver vazia.

        fila.poll();//-> Retorna e remove o elemento que entrou primeiro. Retorna "null" se a fila estiver vazia.

        fila.peek();//-> Retorna o elemento que entrou primeiro, sem removê-lo. Retorna "null" se a fila estiver vazia.



    }
}
