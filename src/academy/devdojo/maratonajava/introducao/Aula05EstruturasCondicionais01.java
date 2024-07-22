package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[]args){

        int idade = 18;
        boolean permitidoEntrada = idade >= 18;
        if (permitidoEntrada) {
            System.out.println("Sua entrada foi permitida!");
        }else{
            System.out.println("Sua entrada nao foi permitida");
        }
        System.out.println("Pode entrar.");
    }
}
