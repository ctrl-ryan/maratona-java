package exerciciosjava.Oexeption.exeption.test;


import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) {
        System.out.println("Método main");
        try{
            metodoA();
        }catch (ArithmeticException e){
            System.out.println("Divisão por zero não existe " + e.getMessage());
        }
    }

    public static void metodoA() {
                metodoB();
    }

    public static void metodoB() {
        metodoC();
    }

    public static void metodoC() {
        int resultado = dividirPorZero(10, 0); // Este método lança uma ArithmeticException
        System.out.println("Resultado: " + resultado);
    }

    public static int dividirPorZero(int x, int y) {
        System.out.println("dentro do método que dará exceção");
        return x / y; // Aqui ocorre a divisão por zero
    }
}