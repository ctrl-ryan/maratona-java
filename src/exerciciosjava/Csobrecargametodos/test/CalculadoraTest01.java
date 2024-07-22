package exerciciosjava.Csobrecargametodos.test;

import exerciciosjava.Csobrecargametodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma de arrays: " + calc.somar(1,2,2,1,1,2,3));
        System.out.println("Soma de dois números: " + calc.somar(1,5));
        System.out.println("Soma de três números: " + calc.somar(1,2,2));
    }
}
