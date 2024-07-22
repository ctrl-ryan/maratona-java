package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Ryan");
        pessoa1.setIdade(18);

        //maneira de imprimir usando getter (que é como usar um método com retorno)
        String nomepessoa1 = pessoa1.getNome();
        int idadepessoa1 = pessoa1.getIdade();
        System.out.println(nomepessoa1);
        System.out.println(idadepessoa1);

        //ou então até getter mesmo sem atribuir a uma variavel:
    /**  System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());     */

        //método sem retorno que apenas imprime sem retorno:
    /** pessoa1.mostrarNome();
        pessoa1.mostrarIdade(); */


    }
}
