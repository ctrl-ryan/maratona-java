package exerciciosjava.NPolimorfismo.Bexemplochatgpt;

public class Teste {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoPix = new PagamentoPix();

        Loja loja1 = new Loja(pagamentoCartao);
        loja1.fazerCompra(100.0);

        Loja loja2 = new Loja(pagamentoPix);
        loja2.fazerCompra(200.0);



    }
}
