package exerciciosjava.NPolimorfismo.Fchatgptatividade.dominio;

public class Locacao implements Desconto {
    private Veiculo veiculo;
    private int dias;
    private Categoria categoria;

    public Locacao(Veiculo veiculo, int dias, Categoria categoria) {
        this.veiculo = veiculo;
        this.dias = dias;
        this.categoria = categoria;
    }

    public double calcularTotal() {
        double valorSemDesconto = veiculo.calcularValorAluguel(this.dias, this.categoria);
        return calcularDesconto(valorSemDesconto,this.dias);
    }

    @Override
    public double calcularDesconto(double valor, int dias) {
        if (dias >= 7) {
            return valor = valor * 0.9;
        } else {
            return valor;
        }
    }

}