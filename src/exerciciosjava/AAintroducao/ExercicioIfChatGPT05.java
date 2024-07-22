package exerciciosjava.AAintroducao;

public class ExercicioIfChatGPT05 {
    public static void main(String[] args) {
        int quantidadeDeCoisas = 36;
        double valorDasCoisas = 14;

        double quantidadeDeCoisas2 = 66;
        int valorDasCoisas2 = 4;

        double valorTotal = quantidadeDeCoisas * valorDasCoisas + quantidadeDeCoisas2 * valorDasCoisas2;
        double valorTotalComDesconto;
        double valorDoDesconto = 0;

        if (valorTotal > 200) {
            valorTotalComDesconto = valorTotal * 0.9;
            valorDoDesconto = valorTotal * 0.1;
        } else {
            valorTotalComDesconto = valorTotal;
        }
        System.out.println("Valor das compras: " + valorTotal);
        System.out.println("Valor do desconto: " + valorDoDesconto);
        System.out.println("Valor total das compras: " + valorTotalComDesconto);
    }
}
