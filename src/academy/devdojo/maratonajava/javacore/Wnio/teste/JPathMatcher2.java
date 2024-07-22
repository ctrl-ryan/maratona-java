package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class JPathMatcher2 {
    public static void main(String[] args) {
        Path path = Paths.get("./");

        try {
            Files.walkFileTree(path, new FindAllTestJavaOrClass());
        } catch (IOException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
