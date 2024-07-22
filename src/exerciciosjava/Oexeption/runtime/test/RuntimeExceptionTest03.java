package exerciciosjava.Oexeption.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(teste());
    }

    public static String teste() {
        try {
            System.out.println("abrindo arquivo...");
            throw new Exception();
//            System.out.println("escrevendo dados no arquivo...");
//            return "Arquivo criado!";
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("fechando recurso liberado por SO...");
        }
        return "Houve um erro na criação do arquivo.";
    }
}
