package exerciciosjava.Hheranca.B.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    private Cargo cargo;
    private static int quantidadeFuncionarios;

    static {
        quantidadeFuncionarios = 0;
    }

    public Funcionario(String nome, String cpf, double salario, Cargo cargo) {
        super(nome, cpf);
        this.salario = salario;
        this.cargo = cargo;
        quantidadeFuncionarios++;
    }

    @Override
    public void getDetails() {
        System.out.println("----------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
        System.out.println("Cargo: " + cargo.IDENTIFICACAO);
        System.out.println("Bonus de salário: " + cargo.calcularBonus(this.salario));
        System.out.println("----------------------------------");
    }


    public static int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

}
