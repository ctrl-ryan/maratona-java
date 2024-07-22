package exerciciosjava.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try{
            teste();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void teste() throws IOException{
        criarArquivo();
    }

    public static void criarArquivo() throws IOException{
        File arquivo = new File("arquivo//exemplo.txt");
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            throw e;
        }
    }
}
