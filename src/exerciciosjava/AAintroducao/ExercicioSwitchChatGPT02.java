package exerciciosjava.AAintroducao;

public class ExercicioSwitchChatGPT02 {
    public static void main(String[] args) {
        String categoria;
        int idade = 0;
        switch (idade) {
            default:
                categoria = "adulto";
                break;
            case 0:
                categoria = "recém-nascido";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                categoria = "bebe";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                categoria = "criança";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                categoria = "adolescente";
                break;
            case 18:
                categoria = "adulto";
                break;
        }
        System.out.printf("a idade %d pertence à categoria %s", idade, categoria);
    }
}
