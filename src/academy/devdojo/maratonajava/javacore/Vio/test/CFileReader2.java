package academy.devdojo.maratonajava.javacore.Vio.test;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CFileReader2 {
    public static void main(String[] args) throws IOException {
/*============================================================================================
A classe FileReader no Java é usada para ler dados de arquivos de texto. Ela lê os caracteres do arquivo um por um
retornando o valor ASCII do caractere. Caso não tenha mais nenhum caractere para iterar, ele retorna um inteiro -1.
 ============================================================================================*/

    //Criando um sistema para armazenar dados de um arquivo em um char:

        File file = new File("CFileReader2.txt");//Criando um objeto arquivo para poder saber o tamanho do número de
        // caracteres.

        char[] content = null; //<- criando o array que vai receber o conteúdo do arquivo

        try (FileReader fr = new FileReader(file)) {
            content = new char[(int) file.length()]; //<- array recebendo o tamanho do arquivo
            int size = fr.read(content);//<- array recebendo o conteúdo do arquivo
            System.out.println(size);//<- o método acima retorna um inteiro representando quantos caracteres foram lidos.
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
        if (content != null) {
            System.out.println(String.valueOf(content).trim());//<- imprimindo conteúdo
        }
    }
}
