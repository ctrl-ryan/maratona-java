package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int j = 0; j < 1000; j++) {
            if (j > 700) {

                break;
            }
            System.out.println(j);
        }
    }
}
