package exerciciosjava.Dconstrutores.test;

import exerciciosjava.Dconstrutores.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 5, 6);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Aprovado: " + aluno1.isAprovado());
    }
}
