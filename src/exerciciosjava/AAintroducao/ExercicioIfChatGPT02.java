package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT02 {
    public static void main(String[] args) {
        //verificar se o ano é bissexto
        int numero01 = 4;
        int numero02 = 4;
        int numero03 = 3;

        if (numero01 > numero02 && numero01 > numero03){
            System.out.println(numero01);
        }else if (numero02 > numero03){
            System.out.println(numero02);
        }else{
            System.out.println(numero03);
        }

    }
}
