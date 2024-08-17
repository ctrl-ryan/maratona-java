package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class KNavigableMap01 {

    public static void main(String[] args) {
//Navigable deve ser usado para referenciar uma classe que utilize Comparable ou Comparator para ordenar os objetos que ela implementa.

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("D", "Letra D");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

    //Métodos a mais da interface NavigableSet:

        System.out.println(map.headMap("C"));//-> retorna o que está "acima".
        System.out.println(map.headMap("C",true));//-> retorna C, e o que está "acima".

        System.out.println(map.ceilingEntry("D"));
        System.out.println(map.ceilingKey("B"));

        System.out.println(map.floorEntry("A"));
        System.out.println(map.floorKey("A"));

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map.higherEntry("C"));
        System.out.println(map.higherKey("C"));

        System.out.println(map.lowerEntry("C"));
        System.out.println(map.lowerKey("C"));



    }
}
