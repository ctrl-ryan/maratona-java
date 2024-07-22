package exerciciosjava.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args){
        try{
            teste();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void teste() throws IOException{
        criarArquivo();
    }

    public static void criarArquivo() throws IOException{
        File arquivo = new File("arquivo//exemplo.txt");
        arquivo.createNewFile();
    }


}
