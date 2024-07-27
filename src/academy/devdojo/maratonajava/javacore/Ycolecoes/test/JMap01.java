package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.*;

public class JMap01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();//@ HashMap, LinkedHashMap(mantém ordem de inserção)
        map.put("teklado", "teclado");
        map.put("mousse", "mouse");     //* posso ter elementos como o mesmo valor.
        map.put("mouze", "mouse");      //* posso ter elementos como o mesmo valor.
        map.put("vc", "você2");
        map.put("vc", "você");          //* sobrescreve o valor da chave já existente
        map.putIfAbsent("vc", "você3"); //* adiciona caso a chave não tenha valor


        map.keySet();       //? retorna uma coleção Set (ou seja, sem elementos duplicados), com todas as chaves.
        map.values();       //? retorna uma coleção Collection com todos os valores.
        map.get("vc");      //? retorna o valor da chave passado como argumento.
        map.entrySet();     //? retorna um Set com um Entry contendo todas as chaves e valores.

//-----------------------------------------------------------------------------------------------------------------------------

        //! COMO FUNCIONA O ENTRY-SEwT:

        Set<Map.Entry<String, String>> entries = map.entrySet(); /// retorna um Set, com um Map.Entry contendo as chaves e valores.

        for (Map.Entry<String, String> entry : entries) {   /// posso iterar pelo Set, usando uma variável Map.Entry
            //* O tipo Map.Entry possui alguns métodos como:

            entry.getValue();       //* Retorna o valor do Map.Entry.
            entry.getKey();         //* Retorna a chave do Map.Entry.
            entry.setValue("haha"); //* Substitui o valor do Map.Entry.
        }
//-----------------------------------------------------------------------------------------------------------------------------
        //!COMO FUNCIONA KEY-SET + GET:

        Set<String> chaves = map.keySet(); /// Retorna uma coleção Set (pois não pode haver chaves repetidas), com todas as chaves do map.

        for (String chave : chaves) { /// Posso iterar sobre as chaves.

            map.get(chave); /// Com o map.get, eu consigo retornar o valor de alguma chave.
        }


    }
}
