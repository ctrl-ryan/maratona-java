package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT01 {
    public static void main(String[] args) {
        int ano = 2020;
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("é ano bissexto");
        }else{
            System.out.println("nao é ano bissexto");
        }
    }
}
