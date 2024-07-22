package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class DBufferedWriter {
    public static void main(String[] args) {
/*==============================================================================================
A classe BufferedWriter no Java é usada para escrever texto em um fluxo de saída de maneira eficiente. Ela usa um buffer interno para armazenar dados temporariamente, reduzindo o número de acessos ao disco e melhora a performance.
==============================================================================================*/

        //Cria-se um FileWriter com uma instância de File e um BufferedFileWriter com uma instância de FileWriter.

        File file = new File("BFileWriter1.txt");
        try(FileWriter fr = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fr)){

            bw.write("Escrevendo dentro do arquivo :)");
            bw.newLine();//<- quebra de linha compatível com qualquer sistema operacional.
            bw.write("Escrevendo em uma nova linha para testar o método .newLine(); :]");
            bw.flush();// -> Garantindo que os dados sejam escritos imediatamente.


        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }
}
