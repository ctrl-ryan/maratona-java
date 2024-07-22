package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
//        int i ;
//        for ( i = 1; i <= 10; i++) {
//            // Se o número for par, continue para a próxima iteração
//            if (i % 2 == 0) {
//                continue; // Pula o resto do corpo do loop e continua com a próxima iteração
//            }
//            // Se o número for ímpar, imprime-o
//            System.out.println("Número ímpar dentro do loop: " + i);
//        }
//
//        // Impressão fora do loop
//        System.out.println(i);

        double valorCarro = 30000;
        for(int quantidadeParcela =(int) valorCarro ; quantidadeParcela >= 1 ; quantidadeParcela --){
            double valorParcela = valorCarro / quantidadeParcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("valor da parcela: " + valorParcela + " quantidade de parcelas: "+quantidadeParcela);
        }
    }
}


