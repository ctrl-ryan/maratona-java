package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BMetaCaracteres {
    public static void main(String[] args) {
//===========================================================================================

//Meta caracteres são dígitos especiais usados no Pattern para encontrar padrões específicos.

/*
        \d -> dígitos
        \D -> o que nao for dígito
        \s -> espaços em branco (\t \n \f \r)
        \S -> o que não é espaço em branco
        \w -> todas as letras do alfabeto + dígitos + underscore (_).
        \W -> o que nao for letra do alfabeto + dígitos + underscore (_).

        [] ->  intervalo de caracteres (ex: [a - z] -> caracteres de "a" a "z")
 */


        String regex = "0[xX][\\da-fA-F]";
        String texto = "12 0x 0x 0xFFABC 0x109 0x1 0xG";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.print(/*matcher.end() + ":" + */matcher.group()  + " ");
        }

//        int numeroHexadecimal = 0xFFABC;




    }
}
