package exerciciosjava.NPolimorfismo.Bexemplochatgpt;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double quantia) {
        System.out.println("Processando pagamento com cartão: " + quantia);
    }
}