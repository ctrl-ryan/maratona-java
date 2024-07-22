package academy.devdojo.maratonajava.javacore.Wnio.teste;


import java.io.IOException;
import java.nio.file.*;

public class BPath2 {
    public static void main(String[] args) {

//Criaçao de um diretório sozinho:

        Path directory = Paths.get("diretório-sozinho");

        try {
            if (Files.notExists(directory)) {
                Files.createDirectory(directory);
                System.out.println("Diretório criado!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Criaçao de um diretório com sub-diretórios:

        Path subDirectories = Paths.get("exemplo\\diretorio\\subdiretorio");

        try {
            Path createdSubDirectories = Files.createDirectories(subDirectories);
            if (Files.notExists(subDirectories)) {
                System.out.println("Sub-diretórios criados!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Criando arquivos:

        Path archive = Paths.get("exemplo\\diretorio\\subdiretorio\\arquivo.txt");
        //ou...
        Path archive2 = Paths.get(subDirectories.toString(), "arquivo.txt");

        try {
            if (Files.notExists(archive)) {
                Files.createFile(archive);
                System.out.println("O arquivo foi criado!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//Copiar arquivos:


        Path source = Paths.get("exemplo\\diretorio\\subdiretorio\\arquivo.txt");
        Path target = Paths.get("exemplo\\diretorio\\subdiretorio\\arquivo-renomeado.txt");

        try {
            if (Files.notExists(target)) {
                Path copy = Files.copy(source, target);
                System.out.println("O arquivo foi colado!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    /*No método Files.copy(source, target); eu ainda posso passar como argumento as enumerações: StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES, etc...

        .REPLACE_EXISTING: Substitui o arquivo de destino se ele já existir.
        .COPY_ATTRIBUTES: Copia os atributos do arquivo (como timestamps) do arquivo de origem para o arquivo de destino.
        .StandardCopyOption.ATOMIC_MOVE: Realiza a operação de cópia como um movimento atômico.*/
    }
}
