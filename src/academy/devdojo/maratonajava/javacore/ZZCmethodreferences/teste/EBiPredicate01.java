package academy.devdojo.maratonajava.javacore.ZZCmethodreferences.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class EBiPredicate01 {
    public static void main(String[] args) {
//BiPredicate pode receber 2 elementos no seu método principal.

        //Com classes anônimas:
        BiPredicate<List<String>,String> checkOnList1 = new BiPredicate<List<String>, String>() {
            @Override
            public boolean test(List<String> list, String s) {
                return list.contains(s);
            }
        } ;

        //Com lambdas:
        BiPredicate<List<String>, String> checkOnList2 = (list, string) -> list.contains(string);

        //Com method references:
        BiPredicate<List<String>, String> checkOnList3 = List::contains;

        //Usando o método principal da interface funcional BiPredicate:
        ArrayList<String> names = new ArrayList<>(List.of("Ryan", "Pietro"));
        boolean enzo = checkOnList3.test(names, "Enzo");
        System.out.println(enzo);

    }
}
