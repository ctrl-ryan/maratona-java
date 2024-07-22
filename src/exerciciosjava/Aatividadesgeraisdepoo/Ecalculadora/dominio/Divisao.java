package exerciciosjava.Aatividadesgeraisdepoo.Ecalculadora.dominio;

public class Divisao extends OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por zero.");
            return 0;
        } else {
            return x / y;
        }
    }
}
