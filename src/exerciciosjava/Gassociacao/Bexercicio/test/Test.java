package exerciciosjava.Gassociacao.Bexercicio.test;

import exerciciosjava.Gassociacao.Bexercicio.dominio.Aluno;
import exerciciosjava.Gassociacao.Bexercicio.dominio.Curso;
import org.xml.sax.ext.Attributes2;

public class Test {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ryan",18);
        Aluno aluno2 = new Aluno("Pedro",19);
        Aluno aluno3 = new Aluno("João",19);

        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Engenharia de Software");
        Curso curso3 = new Curso("Sistemas de Informação");

        aluno1.setCurso(curso1);
        aluno2.setCurso(curso1);
        aluno3.setCurso(curso1);

        curso1.setAlunos(new Aluno[]{aluno1, aluno2,aluno3});
        System.out.println("ALUNOS DO CURSO:");
        curso1.imprimaAlunos();

        System.out.println("\nINFORMAÇAO DOS ALUNOS: ");
        aluno1.imprima();
        aluno2.imprima();
        aluno3.imprima();



    }
}
