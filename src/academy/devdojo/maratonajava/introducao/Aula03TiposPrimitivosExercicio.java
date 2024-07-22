package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args){
        /*
        Prática
        Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de < salario>
        na data <data>
         */
        String nome = "Ryan Souza";
        String endereco = "Planaltina, GO";
        float salario = 1280.50f;
        String dataRecebimento = "10/10/2025";
        String relatorio = "Eu, " + nome + ", confirmo que recebi o salário de "+ salario + " na data "+ dataRecebimento+ ".";

        System.out.println(relatorio);
    }
}
