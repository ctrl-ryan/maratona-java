package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HDirectoryStream1 {
    public static void main(String[] args) {
        Path dir = Paths.get("./");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path: stream){
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Ocorreu um erro " + e.getMessage());
        }
    }
}
