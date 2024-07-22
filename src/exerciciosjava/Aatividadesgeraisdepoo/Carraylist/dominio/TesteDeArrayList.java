package exerciciosjava.Aatividadesgeraisdepoo.Carraylist.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TesteDeArrayList {
    public static void main(String[] args) {

        ArrayList<String> exemplo = new ArrayList<String>();
        exemplo.add("robson");
        exemplo.add("jose");
        exemplo.add("seila");
        exemplo.add("wendy");
        exemplo.add("oioio");

        System.out.println("-------------FOR ITERATE-------------");

        for (int i = 0; i < exemplo.size(); i++) {
            System.out.println(exemplo.get(i));
        }

        exemplo.remove(0);

        System.out.println("-------------FOR ITERATE-------------");

        for (int i = 0; i < exemplo.size(); i++) {
            System.out.println(exemplo.get(i));
        }

        System.out.println("-------------ORDENADO-------------");
        Collections.sort(exemplo);
        for(String i: exemplo){
            System.out.println(i);
        }

        System.out.println("-------------ORDENADO REVERSO-------------");
        Collections.sort(exemplo, Collections.reverseOrder());
        for(String i: exemplo){
            System.out.println(i);
        }

    }
}
