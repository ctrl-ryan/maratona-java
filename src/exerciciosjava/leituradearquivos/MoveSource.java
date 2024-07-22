package exerciciosjava.leituradearquivos;

import java.io.IOException;
import java.nio.file.*;

public class MoveSource {
    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\move_source.txt");
        Path target = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\move_source\\moved_source.txt");

        moveSource(source,target);
    }

    public static void moveSource(Path source, Path target){

        try {
            Files.move(source,target,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("O arquivo foi movido!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

    }
}
