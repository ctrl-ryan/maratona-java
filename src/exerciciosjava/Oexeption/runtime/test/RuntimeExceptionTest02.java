package exerciciosjava.Oexeption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

    }

    /**
     * @param x
     * @param y não pode ser zero
     * @throws IllegalArgumentException
     * @throws IllegalArgumentException caso "y" seja 0
     */
    public static void divisao(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Não podemos dividir um número por zero.");
        }
        System.out.println(x / y);
    }
}
