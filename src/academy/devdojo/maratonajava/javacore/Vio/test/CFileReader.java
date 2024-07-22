package academy.devdojo.maratonajava.javacore.Vio.test;


    import java.io.FileReader;
import java.io.IOException;

public class CFileReader {
    public static void main(String[] args) throws IOException {
/*============================================================================================
A classe FileReader no Java é usada para ler dados de arquivos de texto. Ela lê os caracteres do arquivo um por um retornando o valor ASCII do caractere. Caso não tenha mais nenhum caractere para iterar, ele retorna um inteiro -1.
 ============================================================================================*/

    //Criando um sistema para imprimir os dados de um arquivo.

        try(FileReader fr = new FileReader("CFileReader1.txt")){
            int i;// <- variável auxiliar
            while (( i=fr.read())!= -1){// <- enquanto i receber inteiros != de -1.
                System.out.print((char) i);// ↓ imprima i como um char.
            }
        }catch (IOException e){
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }
}
