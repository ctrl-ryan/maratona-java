package academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Aexercicioassociacao.dominio.Seminario;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Wendy", 14);
        Aluno aluno2 = new Aluno("Kamilla", 18);
        Aluno aluno3 = new Aluno("Rafael", 17);
        Aluno[] alunos = new Aluno[]{aluno1,aluno2,aluno3};

        Aluno[] alunos1 = new Aluno[]{aluno1};
        Aluno[] alunos2 = new Aluno[]{aluno2};
        Aluno[] alunos3 = new Aluno[]{aluno3};

        Seminario seminario1 = new Seminario(" Matemática");
        Seminario seminario2 = new Seminario(" Contabilidade");
        Seminario seminario3 = new Seminario(" Engenharia da Computação");
        Seminario[] seminarios = new Seminario[]{seminario1,seminario2,seminario3};

        Local local1 = new Local("Rua A, Cidade A, Bairro A, 7598231");
        Local local2 = new Local("Rua B, Cidade B, Bairro B, 7598231");
        Local local3 = new Local("Rua C, Cidade C, Bairro C, 7598231");

        Professor professor1 = new Professor("Marcelo", "Matemática");

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario3);

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);
        seminario3.setAlunos(alunos3);

        seminario1.setLocal(local1);
        seminario2.setLocal(local2);
        seminario3.setLocal(local3);

        professor1.setSeminarios(seminarios);

        System.out.println("--------------SEMINÁRIOS--------------");
        for (Seminario seminario: seminarios){
            seminario.imprima();
        }

        System.out.println("\n--------------PROFESSORES--------------");
        professor1.imprima();

        System.out.println("\n--------------ALUNOS--------------");
        for (Aluno aluno: alunos){
            aluno.imprima();
        }
    }
}
