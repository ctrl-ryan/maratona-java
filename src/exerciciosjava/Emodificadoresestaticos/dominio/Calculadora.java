package exerciciosjava.Emodificadoresestaticos.dominio;

public class Calculadora {
    private static int x;
    private static int y;

    public static int adicao(int x , int y){
        return x + y;
    }
    public static int subtracao(int x , int y){
        return x - y;
    }
    public static int multiplicacao(int x , int y){
        return x * y;
    }
    public static int divisao(int x , int y){
        return x / y;
    }
}
