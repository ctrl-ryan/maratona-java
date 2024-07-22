package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EBinarySearch01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(7);
        numeros.add(9);
        numeros.add(10);
        Collections.sort(numeros);
        System.out.print("Lista: " + numeros);
        //index: 0 1 2 3
        //value: 0 2 4 3

        //caso o elemento não esteja na lista, a lógica de retorno é: - (x + 1) onde "x" é a posição onde o elemento
        // que você buscou deveria estar.

        System.out.print("\nBinarySearch números: ");
        System.out.print(Collections.binarySearch(numeros, 6) + " ");
        System.out.print(Collections.binarySearch(numeros, 1) + " ");
        System.out.print(Collections.binarySearch(numeros, 11) + " ");
        System.out.println(Collections.binarySearch(numeros, 0) + " ");

    }
}
