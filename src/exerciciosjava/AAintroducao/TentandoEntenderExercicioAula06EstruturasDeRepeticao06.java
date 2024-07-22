package exerciciosjava.AAintroducao;

public class TentandoEntenderExercicioAula06EstruturasDeRepeticao06 {
    public static void main(String[] args) {
        double valorCelular = 1000;
        double valorPrestaçoes;
        for (int quantidadePrestaçoes = 1; quantidadePrestaçoes <= 1000; quantidadePrestaçoes++) {
            valorPrestaçoes = valorCelular / quantidadePrestaçoes;
            if (valorPrestaçoes < 250) {
                break;
            }
            System.out.println("Quantidade de prestaçoes: " + quantidadePrestaçoes + "x" + " Preço das prestaçoes: R$" + valorPrestaçoes);
        }
    }
}

