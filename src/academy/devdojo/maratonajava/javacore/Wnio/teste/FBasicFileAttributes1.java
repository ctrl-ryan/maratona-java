package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FBasicFileAttributes1 {
    public static void main(String[] args) {
/*=========================================================================================
A classe BasicFileAttributes pertence ao pacote java.nio.file.attribute e fornece informações básicas sobre um
arquivo. É usada para acessar atributos como tempo de criação, último acesso, última modificação, entre outros.
 ========================================================================================*/

        Path path = Paths.get("pasta/new.txt");

        try {

//Método para leitura de atributos de arquivos:

            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            //Obter tempo de criação de um arquivo:

            FileTime creationTime = basicFileAttributes.creationTime();
            System.out.println("Criação: " + creationTime);

            //Obter tempo do último acesso do arquivo:

            FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
            System.out.println("Último acesso: " + lastAccessTime);

            //Obter tempo da última modificação do arquivo:

            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
            System.out.println("Última modificação: " + lastModifiedTime);

        } catch (IOException e) {
            System.err.println("Erro ao ler atributo do arquivo: " + e.getMessage());
        }
    }
}
