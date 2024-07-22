package exerciciosjava.Csobrecargametodos.dominio;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }


    public void depositar(double valor) {
        this.saldo -= valor;
        System.out.println("---------------------");
        System.out.println("Você depositou R$" + saldo);
        System.out.println("Saldo: " + getSaldo());
        System.out.println("---------------------");

    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("---------------------");
            System.out.println("Você sacou R$" + valor);
            System.out.println("Saldo: R$" + getSaldo());
        } else {
            System.out.println("---------------------");
            System.out.println("Saldo Insuficiente.");

        }
    }

    public static double converterMoeda(double saldo, double taxaDeConversao) {
        return saldo *= taxaDeConversao;

    }

    public double getSaldo() {
        return this.saldo;
    }
}
