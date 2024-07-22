package exerciciosjava.leituradearquivos;

import java.io.*;

public class ReadArchive {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\exercitando-java\\input.txt");
        lerArquivo(file);
    }

    public static void lerArquivo(File file) {
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String texto;
            while ((texto = br.readLine()) != null) {
                System.out.println(texto);
            }
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado..." + e.getMessage());

        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
