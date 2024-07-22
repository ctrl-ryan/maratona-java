package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //valores padroes
        //byte, short, int, long, float, double recebem 0
        //char recebe \u0000 (que é o unicode do espaço)
        //boolean recebe false
        //String recebe null

        String[] nomes = new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        nomes [0] = "Sasuke";
        nomes [1] = "Naruto";
        nomes [2] = "Sakura";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
