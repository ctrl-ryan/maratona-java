package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DResolucao {
    public static void main(String[] args) {
        Path absoluto = Paths.get("C:/");
        Path relativo = Paths.get("Users/User/ryan/Documents");
        Path file = Paths.get("arquivo.txt");

        System.out.println("absoluto + relativo: " + absoluto.resolve(relativo));
        System.out.println("relativo + absoluto: " + relativo.resolve(absoluto));//Não funciona.
        System.out.println("relativo + relativo: " + relativo.resolve(file));
        System.out.println("absoluto + absoluto: " + absoluto.resolve(relativo));//Não funciona.
        System.out.println("absoluto + relativo: " + absoluto.resolve(relativo));
        
    }
}
