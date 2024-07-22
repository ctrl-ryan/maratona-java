
package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FListaArrayConversao03 {
    public static void main(String[] args) {
//============================================================================================
//Para criar uma lista provida de um array que permita alterações sem erros, podemos fazer da seguinte maneira:

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

        numerosList.add(4);

        System.out.println("Array: " + Arrays.toString(numerosArray));
        System.out.println("Lista: " + numerosList);
//============================================================================================
    }
}
