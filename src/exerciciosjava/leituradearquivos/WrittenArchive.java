package exerciciosjava.leituradearquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WrittenArchive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva algo para ser gravado num arquivo: ");
        String text = scanner.nextLine();
        Path recordedFile = null;

        if (text != null) {
            recordedFile = gravar(text);
        }

        System.out.println("Deseja ver o que foi gravado?\n1-Sim\n2-Não");
        int choice = scanner.nextInt();


        switch (choice) {
            default:
                System.out.println("Opção Inválida.");
                break;
            case 1:
                if (text != null) {
                    readFile(recordedFile);
                } else {
                    System.out.println("Nenhum texto foi gravado.");
                    break;
                }
            case 2:
                scanner.close();
                break;
        }
    }

    public static Path gravar(String text) {
        Path file = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\output.txt");


        try {
            Files.write(file, text.getBytes());
            System.out.println("Texto gravado com sucesso!");
            return file;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro. " + e.getMessage());
            return null;
        }
    }

    public static void readFile(Path file) {

        try (FileReader fileReader = new FileReader(file.toFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String texto;
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println("\"" + texto + "\"");
            }

        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro. " + e.getMessage());
        }

    }
}
