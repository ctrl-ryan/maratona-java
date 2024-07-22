
package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FListaArrayConversao04 {
    public static void main(String[] args) {
//===========================================================================================
//Há como criar uma Lista com valores ja definidos:

    //Exemplo com inteiros:

        List<Double> list = Arrays.asList(1D, 2D, 3D, 4D, 5D, 6D);
        System.out.println(list);

    //Exemplo com strings:

        List<String> list1 = Arrays.asList("Ryan", "Pietro", "Enzo");
        System.out.println(list1);

//============================================================================================
//Resumo:

    //Passar Lista para Array:

        List<Integer> arrayToList = Arrays.asList(10, 20, 30);
        Integer[] array1 = arrayToList.toArray(new Integer[0]);
        System.out.println("Lista para array: " + Arrays.toString(array1));

    //Passar Array para Lista (lista que depende do array):

        Character[] characters = new Character[]{'a','b','c'};
        List<Character> list2 = Arrays.asList(characters);
        System.out.println(list2);

        
    }
}
