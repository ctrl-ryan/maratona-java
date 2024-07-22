package exerciciosjava.Hheranca.B.test;

import exerciciosjava.Hheranca.B.dominio.Cargo;
import exerciciosjava.Hheranca.B.dominio.Departamento;
import exerciciosjava.Hheranca.B.dominio.Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Ryan Souza","418042412-231", 1400, Cargo.GERENTE);
        Funcionario[] funcionarioDepartamento ={func1};

        Departamento depar1 = new Departamento("Departamento de TI",funcionarioDepartamento);

        func1.getDetails();

    }
}
