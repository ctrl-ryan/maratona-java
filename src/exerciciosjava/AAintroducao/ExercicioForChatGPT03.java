package exerciciosjava.AAintroducao;

public class ExercicioForChatGPT03 {
    public static void main(String[] args) {
        //escreva um programa que forneça todos os divisores de um numero
        int numero = 10;
        int divisores = 1;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = i;
                System.out.println(divisores);
            }
        }
    }
}
