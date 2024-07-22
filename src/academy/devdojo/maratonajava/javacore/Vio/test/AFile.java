package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

public class AFile {
    public static void main(String[] args) {
/*============================================================================================
    A classe File no Java é usada para manipulação de arquivos e diretórios. Com ela, você pode criar, excluir,
    verificar a existência, obter informações e listar arquivos e diretórios.
 ============================================================================================*/

        //Criando um objeto arquivo:

        File file = new File("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\src\\academy\\devdojo\\maratonajava" +
                             "\\javacore\\Vio\\test\\fileTest.txt");


        try {
        //Criando arquivo (Obrigatório o tratamento de exceção):
            System.out.println("Arquivo criado: " + file.createNewFile());
        //Outros métodos:
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absoluto: " + file.getAbsolutePath());
            System.out.println("É um diretório: " + file.isDirectory());
            System.out.println("É um arquivo: " + file.isFile());
            System.out.println("É um arquivo oculto: " + file.isHidden());
            System.out.println("Pode ser executado: " + file.canExecute());
            System.out.println("Pode ser lido: " + file.canWrite());
            System.out.println("Pode ser lido: " + file.canRead());
            System.out.println("Última modificação: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

    //Deletando arquivo:
        if (file.exists()) {System.out.println("Arquivo deletado: " + file.delete());}

    }
}
