package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //    metodo com retorno

        double resultado = calculadora.dividaDoisNumeros(20,0);
        System.out.println(resultado);
    }
}
