package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //dado um carro de 30000 reais, calcule quantas vezes ele pode ser parcelado
    //desde que suas parcelas sejam maior que 1000 reais
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        for (int numeroDeParcelas = 1; numeroDeParcelas < 30000; numeroDeParcelas++) {
            valorParcela = valorCarro / numeroDeParcelas;
            if (valorParcela >= 1000){
                System.out.println("Valor da parcela: R$" + valorParcela + " |||| Numero de parcelas: " + numeroDeParcelas + "x");
            }else{
                break;
            }

        }
    }
}
