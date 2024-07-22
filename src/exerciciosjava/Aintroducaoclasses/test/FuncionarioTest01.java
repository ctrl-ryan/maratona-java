package exerciciosjava.Aintroducaoclasses.test;

import exerciciosjava.Aintroducaoclasses.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Cleuson";
        funcionario.idade = 45;
        funcionario.salarios = new double[]{3456,1234,354};

        funcionario.imprimaDados();
        funcionario.imprimaMediaSalarios();
    }
}
