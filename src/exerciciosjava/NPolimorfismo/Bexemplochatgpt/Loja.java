package exerciciosjava.NPolimorfismo.Bexemplochatgpt;

public class Loja {
    private Pagamento metodoDePagamento;

    public Loja(Pagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void fazerCompra(double quantia) {
        metodoDePagamento.processarPagamento(quantia);
    }
}