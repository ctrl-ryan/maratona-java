package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
//exercício: faça uma classe Funcionário com os seguintes atributos: nome, idade e salário. Crie dois métodos:
// Para imprimir os dados e para tirar média dos salarios e imprimir o resultado.


public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaDosSalarios;


    public void imprimaDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        System.out.print("Os salários são: | ");
        for (double num : salarios) {
            System.out.print("R$" + num + " | ");
        }

    }

    public void imprimaMediaSalarios() {
        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            mediaDosSalarios = mediaDosSalarios + salario;
        }
        mediaDosSalarios = mediaDosSalarios / salarios.length;
        System.out.printf("\nA média dos salarios é: R$" + mediaDosSalarios);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMediaDosSalarios() {
        return mediaDosSalarios;
    }
}
