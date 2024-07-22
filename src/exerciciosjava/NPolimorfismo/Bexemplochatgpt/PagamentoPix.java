package exerciciosjava.NPolimorfismo.Bexemplochatgpt;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double quantia) {
        System.out.println("Processando pagamento com PayPal: " + quantia);
    }
}