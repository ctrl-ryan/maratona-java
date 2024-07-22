package academy.devdojo.maratonajava.javacore.Kenumeracao.exemplocliente.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.test.PessoaTest01;
import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Kenumeracao.exemplocliente.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.exemplocliente.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.exemplocliente.dominio.TipoPagamento;

import java.util.Scanner;

public class ClientTest01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Cliente cliente1 = new Cliente("cliente1", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("cliente2", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        String pesquisa = scanner.nextLine();
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio(pesquisa));

    }
}
