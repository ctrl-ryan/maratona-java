
package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class AFile2 {
    public static void main(String[] args) {
/*==========================================================================================
Vamos ver como usar a classe file para a criação de diretórios, ao invés de arquivos.
==========================================================================================*/

    //Criando um diretório:

        File directory = new File("pasta");
        boolean isDirectoryCreated = directory.mkdir();//<-- criação do diretório
        System.out.println("Pasta criada? " + isDirectoryCreated);


    //Criando um arquivo dentro do diretório (Há duas maneiras):

        File fileDirectoryArchive = new File(directory, "arquivo.txt");//<-- passando o objeto que é o diretório onde você quer o arquivo (que é o que fizemos aqui), ou então passando o absolute path do local onde você quer o arquivo (exemplo: C:\Users\ryanp\IdeaProjects\maratona-java\pasta).


        try {
            boolean isCreatedNewDirectoryArchive = fileDirectoryArchive.createNewFile();// <- Criando de fato o arquivo (Exceção precisa ser tratada).

            System.out.println("Arquivo dentro do diretório criado? " + isCreatedNewDirectoryArchive);

        } catch (IOException e) {
            System.out.println("Ocorreu um erro" + e.getMessage());
        }

//    Renomeando um arquivo:

        File toRenameFile = new File(directory,"arquivo_renomeado");
        boolean isRenamed = fileDirectoryArchive.renameTo(toRenameFile);
        System.out.println("O arquivo foi renomeado? " + isRenamed);

//    Renomeando um diretório:

        File toRenameDirectory = new File("pasta-renomeada");
        boolean isDirectoryRenamed = directory.renameTo(toRenameDirectory);
        System.out.println("O arquivo foi renomeado? " + isDirectoryRenamed);
    }
}
