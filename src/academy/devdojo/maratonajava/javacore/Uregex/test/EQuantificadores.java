package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EQuantificadores {
    public static void main(String[] args) {
/*===========================================================================================
Quantificadores

Exemplos:

        \d -> dígitos
        \D -> o que nao for dígito
        \s -> espaços em branco (\t \n \f \r)
        \S -> o que não é espaço em branco
        \w -> todas as letras do alfabeto + dígitos + underscore (_).
        \W -> o que nao for letra do alfabeto + dígitos + underscore (_).

        Z -> zero ou uma ocorrência
        * -> zero ou mais
        + -> uma ou mais
        {x} -> exatamente x
        {x,y} -> pelo menos x e no máximo y
        {x,} -> pelo menos x vezes
        () -> agrupamento
        | -> "ou"  (ex: o(v|c)o = "ovo" ou "oco")
        $ -> fim da linha

===========================================================================================*/

//Procurando emails válidos:

        String emails = "john.doe@example.com, jane.smith@gmail.com.br, peter.parker@yahoo.com, emily.jones@hotmail.com.net.br, michael.brown@outlook.com, alice@company, bob@123@gmail.com, carol.smith@.net, david#example.com, emma@domain..com";

        String regex = "[(\\w\\.-_)]+@([a-zA-Z])+(\\.([a-z]+))+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()){
            System.out.print(matcher.start() + ":");
            System.out.println(matcher.group() + " |" + matcher.group().matches(regex) + "| ");
        }
    }
}
