package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Kanye");
        funcionario1.setIdade(45);
        funcionario1.setSalarios(new double[]{4356, 2346, 5678});
        /** funcionario1.setMediaDosSalarios;**///<-- alterar a média do funcionario nao é para ser algo possivel, entao tiramos o método set dele.


        funcionario1.imprimaDados();
        funcionario1.imprimaMediaSalarios();
    }
}
