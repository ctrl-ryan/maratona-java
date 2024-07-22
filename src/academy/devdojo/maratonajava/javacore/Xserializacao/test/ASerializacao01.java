package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ASerializacao01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "José Camargo", "12345678");
        Turma turma = new Turma("RyanAcademy");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            if (Files.notExists(path)) Files.createFile(path);
            oos.writeObject(aluno);


        } catch (IOException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void desserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }


}
