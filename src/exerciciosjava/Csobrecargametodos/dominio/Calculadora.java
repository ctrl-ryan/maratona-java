package exerciciosjava.Csobrecargametodos.dominio;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public int somar(int a, int b, int c){
        return a + b + c;
    }
    public int somar(int...numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
        soma = soma + numeros[i];
        }
        return soma;
    }
}
