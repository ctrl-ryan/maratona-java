package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT06 {
    public static void main(String[] args) {
        boolean isPrimo = true;
        int numero = 4;

        if (numero > 1) {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        } else {
            isPrimo = false;
        }
        if (isPrimo) {
            System.out.printf("o numero %d é primo",numero);
        }else{
            System.out.printf("o numero %d nao é primo", numero);
        }
    }
}
