package exerciciosjava.AAintroducao;

public class ExercicioChatGPTUsandoContinue {
    //Calcular a soma dos números ímpares de 1 a 10, pulando os números pares.
    public static void main(String[] args) {
//        int soma = 0;
//        for (int i = 0; i <= 10 ; i++){
//            if(i % 2 == 0){
//                continue;
//            }
//            soma = soma + i;
//        }
//        System.out.println("A soma dos numeros ímpares de 1 a 10 é: " + soma);


        for (int i = 1 ; i <= 10 ; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
