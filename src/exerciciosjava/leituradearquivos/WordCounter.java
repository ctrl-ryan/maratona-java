package exerciciosjava.leituradearquivos;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCounter {
    public static void main(String[] args) {

        Path text = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\words.txt");

        int words = countWords(text);
        System.out.println(words);
    }

    public static int countWords(Path file){
        try (FileReader fr = new FileReader(file.toFile());
             BufferedReader br = new BufferedReader(fr)){
            String texto = "";
            texto += br.readLine();
            int words = texto.split(" ").length;
            return words;
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        return 0;
    }
}
