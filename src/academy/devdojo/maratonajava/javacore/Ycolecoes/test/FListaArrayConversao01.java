package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FListaArrayConversao01 {
    public static void main(String[] args) {
//========================================================================================
        //Passando uma Lista de inteiros para um Array de inteiros: List -> Array

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);


        Integer[] arrayDeIntegers = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayDeIntegers));

//========================================================================================

        //Passando um Array de inteiros para uma Lista de inteiros: Array -> List

        Integer[] arrayDeIntegers2 = new Integer[3];
        arrayDeIntegers2[0] = 1;
        arrayDeIntegers2[1] = 2;
        arrayDeIntegers2[2] = 3;

        List<Integer> listaDeIntegers = Arrays.asList(arrayDeIntegers2);
        System.out.println(listaDeIntegers);

//========================================================================================

    }
}
