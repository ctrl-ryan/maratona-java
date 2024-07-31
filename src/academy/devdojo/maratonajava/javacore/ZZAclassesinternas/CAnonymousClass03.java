package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CAnonymousClass03 {
    public static void main(String[] args) {

//exemplo de implementação direta de uma interface:

        List<String> strings = new ArrayList<>(List.of("Oi","Olá","Como vai?"));
        strings.sort(new Comparator<String>() { ///implementei diretamente um Comparator no método sort().
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
