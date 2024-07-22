package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    //metodo void

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiaDoisNumeros() {
        System.out.println(10 - 1);
    }

    // metodo void com parametros

    public void multipliqueDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisao por zero.");
            return;
        }
        System.out.println(num1 * num2);
    }

    //metodo com retorno

    public double dividaDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não existe divisao por zero");
            return 0;
        }
    }

    public void alteraNumero(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println(num1 + " " + num2);

    }

    public void somaArray(double seila ,int... numero) {
        int soma = 0;
        for (int num : numero) {
            soma = soma + num;
        }
        System.out.println(soma);
    }
}