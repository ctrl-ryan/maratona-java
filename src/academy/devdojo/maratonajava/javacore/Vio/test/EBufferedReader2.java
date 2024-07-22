package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EBufferedReader2 {
    public static void main(String[] args) {
/*==============================================================================================
A classe BufferedReader no Java é usada para ler texto de um fluxo de entrada de forma eficiente, armazenando os dados em um buffer. Ela é frequentemente utilizada para ler linhas completas de texto e melhorar a performance da leitura.
==============================================================================================*/

//Armazenando o conteúdo de um arquivo de texto em uma String.

    //Cria-se um FileReader com uma instância de file e um BufferedReader com uma instância de FileReader.

        String content = "";

        File file = new File("CFileReader1.txt");
        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String texto;
            while ((texto = br.readLine()) != null){//<- enquanto 'texto' receber String != de null.
                content = texto.concat(texto);
            }
        }catch (IOException e){
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

        System.out.println(content);
    }
}
