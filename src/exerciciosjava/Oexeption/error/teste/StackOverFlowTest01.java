package exerciciosjava.Oexeption.error.teste;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

        recursivo();

    }
    public static void recursivo(){
        recursivo();
    }
}
