package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Arrays;
import java.util.List;

public class FListaArrayConversao02 {
    public static void main(String[] args) {
//========================================================================================
//Caso eu tenha uma Lista provida de um array, se eu modificar a lista, modificará o array.

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 3;
        numerosArray[1] = 2;
        numerosArray[2] = 1;

        List<Integer> numerosList = Arrays.asList(numerosArray);

        numerosList.set(1,20);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(numerosList);

        //Também não posso alterar uma lista provida de uma array:

//        numerosList.add(2);// <- Dará erro
    }
}
