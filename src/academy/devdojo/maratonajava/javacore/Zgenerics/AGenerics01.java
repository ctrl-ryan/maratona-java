package academy.devdojo.maratonajava.javacore.Zgenerics;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class AGenerics01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        add(new Consumidor("ryan"), lista);


        System.out.println(lista);
    }

    public static void add (Consumidor consumidor, List<String> list){

    }
}
