package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DQuantificadores {
    public static void main(String[] args) {
/*===========================================================================================
Quantificadores

Exemplos:

    Z -> zero ou uma ocorrência
    * -> zero ou mais
    + -> uma ou mais
    {x,y} -> de x a y
    () -> agrupamento
    | -> "ou"  (ex: o(v|c)o = "ovo" ou "oco")
    $ -> fim da linha

===========================================================================================*/

//Procurando números decimais:

        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";// algo em um texto que começe com zero, seguido de "x" ou "X", seguido de qualquer número; ou digito de "a" a "f" minúsculo ou maiúsculo seguido de espaço em branco ou final da linha.

        String texto = "12 0x 0x 0xFFABC 0x10G 0x1 ";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Números hexadecimais: ");
        while (matcher.find()){
            System.out.print(/*matcher.end() + ":" + */matcher.group()  + " ");
        }

//        int numeroHexadecimal = 0xFFABC;

/*===========================================================================================
outros exemplos para entender o uso de quantificadores:*/



//          String regex2 = "b*"; //zero ou mais vezes (aonde nao tiver "b" ele retornará, pois ocorreu zero vezes)

//        String regex2 = "c+"; //uma ou mais vezes (aonde nao tiver "c" ele nao retornará nada, pois tem que ocorrer uma vez ou mais)

//        String regex2 = "d?"; //zero ou uma vez

//        String regex2 = "e{3}(\\s|$)"; //exatamente x vezes seguido de um espaço ou ponto final.

//        String regex2 = "e{2,}"; //pelo menos x vezes

//        String regex2 = "e{2,3}"; //pelo menos x vezes e no mínimo y

        String regex2 = "f..f"; //"." é qualquer elemento, menos quebra de linha

        String texto2 = "1111a bb ccc dddd bbb eeee f22f ggg hhhiiijjjj";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("\n\n\nElemento(s) encontrado(s):");
        while (matcher2.find()){
            System.out.print(matcher2.start() +":");
            System.out.print(matcher2.group() + " ");
        }
    }
}
