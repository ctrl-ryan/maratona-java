package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
/*=======================================================================================
O SimpleFileVisitor é uma classe que facilita a navegação de diretórios de forma recursiva no Java. Ele faz parte do pacote java.nio.file e é usado em conjunto com a classe Files para percorrer uma árvore de diretórios. Você pode sobrescrever métodos dessa classe para definir ações específicas para arquivos e diretórios encontrados durante a navegação.
=======================================================================================*/
class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class ISimpleFileVisitor {


    public static void main(String[] args) {
        Path path = Paths.get("./");


        try{
            Files.walkFileTree(path, new ListJavaFiles());
        } catch (IOException e ){
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
