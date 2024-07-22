package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EBufferedReader {
    public static void main(String[] args) {
/*==============================================================================================
A classe BufferedReader no Java é usada para ler texto de um fluxo de entrada de forma eficiente, armazenando os dados em um buffer. Ela é frequentemente utilizada para ler linhas completas de texto e melhorar a performance da leitura.
==============================================================================================*/
    //Cria-se um FileReader com uma instância de file e um BufferedReader com uma instância de FileReader.

        File file = new File("CFileReader1.txt");
        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String texto;
            while ((texto = br.readLine()) != null){//<- enquanto 'texto' receber String != de null.
                System.out.println(texto);//↓ imprima texto
            }
        }catch (IOException e){
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

    }
}
