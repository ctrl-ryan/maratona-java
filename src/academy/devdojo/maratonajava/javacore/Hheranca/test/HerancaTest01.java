package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {


        Endereco endereco1 = new Endereco();
        endereco1.setBairro("Bairro Baruerí");
        endereco1.setCep("83489-234");

        Endereco endereco2 = new Endereco();
        endereco2.setCep("438928-472");
        endereco2.setBairro("Bairro seila2");
        Pessoa pessoa1 = new Pessoa("Ryan");
        pessoa1.setCpf("234798482379");
        pessoa1.setEndereco(endereco1);
        pessoa1.imprima();

        System.out.println("------------------------------");

        Funcionario funcionario1 = new Funcionario("Pedrinho");
        funcionario1.setCpf("2172937819");
        funcionario1.setEndereco(endereco2);
        funcionario1.setSalario(3847);
        funcionario1.imprima();
        funcionario1.recebiPagamento();
    }
}
