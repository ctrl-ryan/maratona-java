package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CListSort01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Wellington");
        nomes.add("Wallyson");
        nomes.add("Anabelle");
        nomes.add("Beatriz");

        Collections.sort(nomes);//Ordena em ordem alfabética

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
