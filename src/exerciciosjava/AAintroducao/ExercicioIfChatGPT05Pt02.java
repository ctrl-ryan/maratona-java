package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT05Pt02 {
    public static void main(String[] args) {
        double preço1 = 23;
        int quantidade1 = 10;

        double preço2 = 14;
        int quantidade2 = 3;

        double valorTotal = preço1 * quantidade1 + preço2 * quantidade2;

        double desconto = 0;
        double valorTotalComDesconto;

        if (valorTotal > 100) {
            valorTotalComDesconto = valorTotal * 0.9;
            desconto = valorTotal * 0.1;
        }else{
            valorTotalComDesconto = valorTotal;
        }
        System.out.println("valor sem desconto: R$" + valorTotal);
        System.out.println("valor do desconto: R$" + desconto);
        System.out.println("valor final do produto: R$" + valorTotalComDesconto );
    }
}
