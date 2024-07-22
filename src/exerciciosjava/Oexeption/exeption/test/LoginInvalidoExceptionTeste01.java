package exerciciosjava.Oexeption.exeption.test;

import exerciciosjava.Oexeption.exeption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void login() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu username: ");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();
        String username = "Ryan";
        String senha = "1234";

        if (!usernameDigitado.equals(username) || !senhaDigitada.equals(senha)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Login efetuado com sucesso!");

    }

}
