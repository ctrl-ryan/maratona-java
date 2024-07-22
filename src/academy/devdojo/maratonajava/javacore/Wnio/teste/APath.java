package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class APath {
    public static void main(String[] args) {
/*===============================================================================================
 As classes Path e Paths são usadas para manipular caminhos de arquivos e diretórios de uma maneira mais moderna e poderosa em comparação com as classes antigas como File.

 A classe Path representa um caminho na árvore de diretórios. Ela pode ser usada para referenciar tanto arquivos quanto diretórios.
===============================================================================================*/

    //A classe Paths é uma classe utilitária que fornece métodos estáticos para obter instância de Path (O método mais comum é get, que é sobre-carregado com várias maneiras de se criar um objeto Path):

        Path p1 = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java\\BFileWriter1.txt");

        Path p2 = Paths.get("C:\\Users\\ryanp\\IdeaProjects\\maratona-java", "BFileWriter1.txt");

        Path p3 = Paths.get("C","Users","ryanp","IdeaProjects","maratona-java","BFileWriter1.txt");

        System.out.println(p3.getFileName());


    }
}
