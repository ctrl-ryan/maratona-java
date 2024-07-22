package exerciciosjava.Oexeption.exeption.test;


import exerciciosjava.Oexeption.exeption.dominio.Leitor1;
import exerciciosjava.Oexeption.exeption.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo1();
    }
    public static void lerArquivo1() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2();) {
            System.out.println("Dentro do try.");
        } catch (IOException e) {
            System.out.println("Dentro do catch.");
            e.printStackTrace();
        }
        System.out.println("Código continuando depois do try-catch");
    }


    //código feio da mulestia
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
