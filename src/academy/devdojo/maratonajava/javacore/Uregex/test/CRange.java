package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CRange {
    public static void main(String[] args) {
/*===========================================================================================
O Range "[]" representa um intervalo de caracteres definido dentro de colchetes.

Exemplos:
            [a-z] -> letras minusculas de "a" a "z".
            [0-9] -> números de 0 a 9.
            [a-zA-Z0-9] -> todas as letras do alfabeto minusculas e minusculas e dígitos.

===========================================================================================*/


        String regex = "0[xX][\\da-fA-F]";//começando com zero, logo após um x ou X, seguido de dígitos e letras minúsculas de "a" a "z".

        String texto = "12 0x 0x 0xFFABC 0x109 0x1 0xG";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);


        while (matcher.find()){
            System.out.print(/*matcher.end() + ":" + */matcher.group()  + " ");
        }

//        int numeroHexadecimal = 0xFFABC;




    }
}
