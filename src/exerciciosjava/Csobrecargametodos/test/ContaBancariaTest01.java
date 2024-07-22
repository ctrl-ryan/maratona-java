package exerciciosjava.Csobrecargametodos.test;

import exerciciosjava.Csobrecargametodos.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("6391", 10000);
        System.out.println("*************************\nSeu saldo: " + contaBancaria1.getSaldo() + "\n*************************");

        contaBancaria1.sacar(3000);
        contaBancaria1.depositar(2000);

        System.out.println("Converter Valores: $" + ContaBancaria.converterMoeda(contaBancaria1.getSaldo(), 0.19));
    }
}
