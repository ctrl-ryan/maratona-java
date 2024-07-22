package academy.devdojo.maratonajava.javacore.Qstrings.teste;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Ryan";

        System.out.println("Letra no index passado como argumento: " + nome.charAt(0));
        System.out.println("Retorna o tamanho da String: " + nome.length());
        System.out.println("Voce altera tal digito por outro digito: " + nome.replace("y", "i"));
        System.out.println("Tranforma uma frase para Lowercase ou Uppercase: " + nome.toUpperCase() + " " + nome.toLowerCase());

        String numeros = "012345";

        System.out.println("Retorna o tamanho da String:" + numeros.length());
        System.out.println("Retorna o número começando pelo índice que você colocou (inclusivo) e termina no índice que você colocou (exclusivo): " + numeros.substring(0, 6));

        System.out.println("Remove o espaço no final e no começo do nome: " + nome.trim());
    }
}
