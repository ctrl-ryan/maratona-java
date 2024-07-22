package exerciciosjava.leituradearquivos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyAndPaste {
    public static void main(String[] args) {

        Path source = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\source.txt");
        Path target = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\destination.txt");

        copy(source,target);
    }
    public static void copy(Path source, Path target){
        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo copiado!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }

    }
}
