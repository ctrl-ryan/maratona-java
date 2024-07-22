package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JMap01 {
    public static void main(String[] args) {

        //Para cada "key" eu tenho um "value": Map <K,V>;

        Map<String, String> map = new HashMap<>();//HashMap, LinkedHashMap(mantém ordem de inserção)
        map.put("teklado", "teclado");
        map.put("mousse", "mouse");//<- posso ter elementos como o mesmo valor.
        map.put("mouze", "mouse");//<- posso ter elementos como o mesmo valor.
        map.put("vc", "você2");
        map.put("vc", "você");//sobrescreve o valor da chave já existente
        map.putIfAbsent("vc", "você3");//adiciona caso a chave não tenha valor

        System.out.println("Chaves: " + map.keySet());
        System.out.println("Valores: " + map.values());

        System.out.println("------------------------------------------------\n" +
                           "Pegando valor via chave com for-each: ");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("------------------------------------------------\n" +
                           "Outra maneira de pegar chave e valor com for-each: ");

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.printf("%s: %s%n",entry.getKey(),entry.getValue());
        }



    }
}
