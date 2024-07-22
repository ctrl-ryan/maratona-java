package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT04 {
    public static void main(String[] args) {
        double lado01 = 2;
        double lado02 = 2;
        double lado03 = 2;

        if (lado01 == lado02 && lado02 == lado03) {
            System.out.println("triangulo equilatero");
        } else if (lado01 == lado02 || lado02 == lado03 || lado03 == lado01) {
            System.out.println("triangulo isoceles");
        } else {
            System.out.println("triangulo escaleno");
        }
    }
}
