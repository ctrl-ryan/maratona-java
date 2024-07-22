package exerciciosjava.Oexeption.exeption.test;

import exerciciosjava.Oexeption.exeption.dominio.Funcionario;
import exerciciosjava.Oexeption.exeption.dominio.LoginInvalidoException;
import exerciciosjava.Oexeption.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        funcionario.salvar();
    }
}
