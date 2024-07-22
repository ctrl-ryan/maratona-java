package academy.devdojo.maratonajava.introducao;



public class Aula05EstruturasCondicionais03 {
    public static void main (String []args){
        double salario = 5000;
        String mensagemPossoDoar = "irei doar dinheiro";
        String mensagemNaoPossoDoar= "nao poderei doar dinheiro";
        String resultado;
        //variavel = (condição) ? (oq a variavel vai receber caso seja TRUE) : (oq a variavel vai receber caso seja FALSE)
        resultado = salario >= 5000 ? mensagemPossoDoar : mensagemNaoPossoDoar;
        System.out.println(resultado);

        //outra maneira de fazer que ocupa menos espaço

//        double salario = 1000;
//        String resultado = salario > 5000 ? "Poderei lhe doar" : "Nao poderei lhe doar";
//        System.out.println(resultado);

    }
}
