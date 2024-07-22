package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    public double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprima() {
        super.imprima();
        System.out.println("Salário: " + this.salario);
    }

    public void recebiPagamento() {
        System.out.println("Eu, " + this.nome + ", recebi o pagamento de R$" + this.salario + ".");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
