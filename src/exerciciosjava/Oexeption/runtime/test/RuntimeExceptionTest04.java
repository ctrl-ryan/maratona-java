package exerciciosjava.Oexeption.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        try {
            podeLancar();
        } catch (IOException | SQLException e) {//essa sintaxe nao funciona se tivermos exceções na mesma linha de herança
            System.out.println("Dentro de IOException");
        }

    }

    private static void podeLancar() throws IOException, SQLException {
        throw new SQLException();
    }
}
