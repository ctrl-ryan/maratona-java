package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
        Operadores básicos:
             +, -, *, /
         */

        double n1 = 10;
        int n2 = 20;
        int n3 = 1;
        double resultado = n1 / n2;
        System.out.println(resultado);
        //System.out.println(n2 - n1);
        //System.out.println(n2 + n1);
        //System.out.println(n2 * n1);
        //.out.println(n2 / n1);


        // Operador de resto: %

        int resto = 21 % 2;
        System.out.println(resto);


        //Operadores lógicos: > < >= <= == !=
        boolean isUmMaiorQueZero = 1 > 0;
        boolean isUmMenorQueZero = 1 < 0;
        boolean isUmMaiorOuIgualAZero = 1 >= 0;
        boolean isUmMenorOuIgualAZero = 1 <= 0;
        boolean isUmIgualAZero = 1 == 0;
        boolean isUmDiferenteDeZero = 1 != 0;
        System.out.println(isUmMaiorQueZero);
        System.out.println(isUmMenorQueZero);
        System.out.println(isUmMaiorOuIgualAZero);
        System.out.println(isUmMenorOuIgualAZero);
        System.out.println(isUmIgualAZero);
        System.out.println(isUmDiferenteDeZero);


        /*Operadores Lógicos:

                && (and)
                || (or)
                !
        */

        //  &&
        int idade = 20;
        int idiomas = 2;
        boolean bilingue = idade >= 18 && idiomas > 1;
        boolean naoBilingue = idade >= 18 && idiomas <= 1;
        System.out.println(bilingue);
        System.out.println(naoBilingue);

        // ||

        double contaBancaria1= 2560;
        double contaBancaria2= 12087;
        float ps5 = 8456.5F;
        boolean possoComprarPs5 = contaBancaria1 > ps5  || contaBancaria2 > ps5;
        System.out.println("Posso comprar o PlayStation 5? " + possoComprarPs5);

        // outro exemplo com: ||

        float headphones = 286.99F;
        double pix = 29.99;
        double carteira = 263.56;
        boolean comprarFone = carteira > headphones || headphones < pix;
        System.out.println(comprarFone);


        /* Operadores de Atribuição:
            =
            +=
            -=
            *=
            /=
            %=
            ++
            --
         */

        //usando =/, que é a mesma coisa com +=, -=, /=, %=, *=

        double salario = 1000;
        salario /= 500; // salario = salario / 500;
        System.out.println(salario);

        //usando ++ e --

        int contador = 0;
        contador++;
        System.out.println(contador);

        int contadorDois = 0;
        System.out.println(contadorDois++);
        System.out.println(contadorDois);





    }
}
