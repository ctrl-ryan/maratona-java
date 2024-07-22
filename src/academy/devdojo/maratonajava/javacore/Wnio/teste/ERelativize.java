package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ERelativize {
    public static void main(String[] args) {
/*===================================================================================================
O método relativize da classe Path em Java é usado para criar um caminho relativo entre dois caminhos. Em outras palavras, ele calcula o caminho que você precisa seguir a partir de um caminho de origem para chegar a um caminho de destino.
 ==================================================================================================*/

    //Exemplo:

        Path path = Paths.get("/home/ryan");
        Path path1 = Paths.get("/home/ryan/documentos/documento.txt");

        Path relativized = path.relativize(path1);
        System.out.println(relativized);

    //Exemplo:

        Path path2 = Paths.get("/home/ryan/documentos");
        Path path3 = Paths.get("/home/ryan/jogos/");
        Path relativized1 = path2.relativize(path3);

        System.out.println(relativized1);

    //Exemplo:

        Path path4 = Paths.get("/home/ryan/documentos");
        Path path5 = Paths.get("/usr/trabalhos");
        Path relativized2 = path4.relativize(path5);

        System.out.println(relativized2);

    //Exemplo:

        Path path6 = Paths.get("/home/ryan/documentos/documento.txt");
        Path path7 = Paths.get("/home/ryan");
        Path relativized3 = path6.relativize(path7);

        System.out.println(relativized3);

    //Exemplo:

        Path path8 = Paths.get("facul");
        Path path9 = Paths.get("facul/uninter");
        Path relativized4 = path8.relativize(path9);

        System.out.println(relativized4);

    //Exemplo:

        Path path10 = Paths.get("facul/uninter");
        Path path11 = Paths.get("facul");
        Path relativized5 = path10.relativize(path11);

        System.out.println(relativized5);

    //Exemplo:

        Path path12 = Paths.get("/home/ryan/");
        Path path13 = Paths.get("jogos");
        Path relativized6 = path12.relativize(path13);//Erro!!

        System.out.println(relativized6);
    }
}
