package academy.devdojo.maratonajava.javacore.Pwrappers.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Pwrappers.dominio.ObjetoParaTest;

public class WrapperTest01 {
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 1;
    float floatP = 1.0f;
    double doubleP = 1;
    char charP = 'W';
    boolean booleanP = false;

    Byte byteW = 1;
    Short shortW = 1;
    Integer intW = 1;
    Long longW = 1L;
    Float floatW = 1.0f;
    Double doubleW = 1D;
    Character charW = 'W';
    Boolean booleanW = false;

    public static void main(String[] args) {

        Integer num1 = 10;
        Integer num2 = 20;

        //método de intancia para comparar:
        System.out.println(num1.compareTo(num2));

        //método de classe para comparar:
        System.out.println(Integer.compare(num1, num2));

        //usando método de instância para comparar o nome de dois objetos:
        ObjetoParaTest objeto = new ObjetoParaTest("objeto",10);
        ObjetoParaTest objeto2 = new ObjetoParaTest("objeto",11);
        System.out.println(objeto.getName().compareTo(objeto2.getName()));

        //método para transformar números em Strings:
        Double numeroParaString = 23.32D;
        System.out.println(numeroParaString.toString()+1);
        System.out.println(Double.toString(numeroParaString)+10);

        //método para transformar Strings em números, e vice-versa:

        String stringParaNumeros = "0"; //String --> numero
        System.out.println(Double.valueOf(stringParaNumeros) + 1);

        Integer integerParaString = 0;  //numero --> String
        System.out.println(String.valueOf(integerParaString)+1);

        String stringParaInteger = "1";
        System.out.println(Integer.valueOf(stringParaInteger)+10);

        //métodos que fornecem constantes que represetam o valor máximo de cada tipo primitivo:

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        //método que muda o tipo do valor:


        Integer inteiro = 1;
        System.out.println(inteiro.doubleValue());


        //métodos da classe Character que verificam a categoria de um digito específico:

        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isDigit('!'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
    }
}
