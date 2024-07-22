package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class JPathMatcher1 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/subpasta/file.bkp");
        Path path1 = Paths.get("pasta/subpasta/file.txt");
        Path path2 = Paths.get("pasta/subpasta/file.java");
        Path path3 = Paths.get("pasta/subpasta/file.HAHAH");

        matches(path, "glob:**/*.bkp");
        matches(path1, "glob:**/*.txt");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");

        matches(path1, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
    }
    private static void matches (Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
