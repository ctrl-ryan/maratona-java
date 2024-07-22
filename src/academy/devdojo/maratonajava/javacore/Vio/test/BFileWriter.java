package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

public class BFileWriter {
    public static void main(String[] args) {
/*=============================================================================================
    A classe FileWriter no Java é usada para escrever caracteres em um arquivo de forma simples. Ela pode ser usada para gravar texto em um arquivo de forma eficiente.
 ============================================================================================*/

    //Criando um objeto FileWriter (tratamento de exceção obrigatória):
        try(FileWriter fr = new FileWriter("BFileWriter1.txt")){
            fr.write("Escrevendo dentro do arquivo :)");
            fr.flush();// Garantindo que os dados sejam escritos imediatamente

        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

    //O uso do "true" no construtor ativa o "modo append", onde o que será escrito, será adicionado sem apagar o que estava antes. Veja:

        try(FileWriter fr = new FileWriter("BFileWriter1.txt",true)){
            fr.write("\nAdicionando mais mensagens ao arquivo sem apagar o que estava escrito antes :P");
            fr.flush();// Garantindo que os dados sejam escritos imediatamente
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

    }
}
