package exerciciosjava.Aintroducaoclasses.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimaDados() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print(" R$" + salario);
        }
    }


    public void imprimaMediaSalarios(){
        if(salarios == null){
            return;
        }
        double mediaSalarios = 0;
        for (double salario: salarios){
            mediaSalarios = mediaSalarios + salario;
        }
        mediaSalarios /= salarios.length;
        System.out.println("\nMédia dos salários: " + mediaSalarios);

    }
}
