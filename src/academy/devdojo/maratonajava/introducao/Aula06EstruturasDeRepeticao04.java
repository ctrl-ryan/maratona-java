package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        for(int quantidadeParcela = 1; quantidadeParcela <= 30000 ; quantidadeParcela++){
            valorParcela = valorCarro / quantidadeParcela;
            if(valorParcela < 1000){
                break;
            }
        }
    }
}
