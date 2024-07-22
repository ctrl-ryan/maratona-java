package academy.devdojo.maratonajava.javacore.Wnio.teste;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FBasicFileAttributes2 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/new.txt");


    //Lendo atributos:
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("Tempo de criação: "+basicFileAttributes.creationTime());
            System.out.println("Tempo do último acesso: "+basicFileAttributes.lastAccessTime());
            System.out.println("Tempo da última modificação: "+basicFileAttributes.lastModifiedTime() + "\n\n");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {

            //Conseguindo um objeto que serve para modificar atributos de arquivos:
            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);


            BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();
            //Mesma coisa de:
            BasicFileAttributes basicFileAttributes1 = Files.readAttributes(path, BasicFileAttributes.class);

        //Modificar tempo de atributos:

            //Tempo para modificação:
            FileTime tempoParaModificar = FileTime.fromMillis(LocalDateTime.now().minusYears(35).toEpochSecond(ZoneOffset.UTC));

            //Modificando última modificação:
            fileAttributeView.setTimes(tempoParaModificar,null,null);

            //Modificando último acesso:
            fileAttributeView.setTimes(null,tempoParaModificar,null);

            //Modificando tempo de criação:
            fileAttributeView.setTimes(null,null,tempoParaModificar);

        } catch (IOException e) {
            System.err.println("Erro ao acessar a visualização de atributos do arquivo: " + e.getMessage());
        }

        //Lendo atributos:

        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("Tempo de criação: "+basicFileAttributes.creationTime());
            System.out.println("Tempo do último acesso: "+basicFileAttributes.lastAccessTime());
            System.out.println("Tempo da última modificação: "+basicFileAttributes.lastModifiedTime());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
