package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CNormalize3 {
    public static void main(String[] args) {
/*===================================================================================================
A normalização em NIO (New Input/Output) no Java é um processo que garante que os caminhos de arquivos sejam únicos e consistentes. No pacote java.nio.file, a classe Path tem o método normalize() que é utilizado para remover as redundâncias em um caminho, como "." (representando o diretório atual) e ".." (representando o diretório pai).
===================================================================================================*/


        Path path = Paths.get("home/ryan/arquivos/.././arquivo.txt"); //voltei do diretório "arquivos" pro diretório
        // "ryan".
        System.out.println("\n\nEndereço não normalizado: " + path);

        //Normalizando o endereço:
        System.out.println("Endereço normalizado: " + path.normalize());

//---------------------------------------------------------------------------------------------------
        String enderecoArquivo = "home/ryan/arquivo.txt";//Localização de um arquivo
        String enderecoTesteTxt = "/../../teste.txt";//Voltando diretórios pra achar outro arquivo

        Path path1 = Paths.get(enderecoArquivo);
        Path path2 = Paths.get(enderecoArquivo, enderecoTesteTxt);

        System.out.println("\n\nEndereço não normalizado: " + path2);
        System.out.println("Endereço normalizado: " + path2.normalize());

    }

}
