package academy.devdojo.maratonajava.javacore.Qstrings.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Ryan";
        nome.concat(" Souza");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Ryan");
        sb.append(" Souza").append(" Rodrigues");

        System.out.println(sb);


    }
}
