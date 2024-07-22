package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;

public class GDosFileAttributes1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) Files.createFile(path);


        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

    //Usando DosFileAttributes

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        dosFileAttributeView.setHidden(true);
        dosFileAttributeView.setArchive(true);
        dosFileAttributeView.setReadOnly(true);


    }
}
