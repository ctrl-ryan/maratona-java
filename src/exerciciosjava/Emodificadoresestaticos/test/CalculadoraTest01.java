package exerciciosjava.Emodificadoresestaticos.test;

import exerciciosjava.Emodificadoresestaticos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        System.out.println("Adiçao: " + Calculadora.adicao(10, 10));
        System.out.println("Subtraçao " + Calculadora.subtracao(10, 10));
        System.out.println("Multiplicaçao: " + Calculadora.multiplicacao(10, 10));
        System.out.println("Divisao:     " + Calculadora.divisao(10, 10));
    }
}
