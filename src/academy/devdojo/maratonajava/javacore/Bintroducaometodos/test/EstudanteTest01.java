package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Ryan";
        estudante1.idade = 18;
        estudante1.sexo = 'M';
        impressora.imprima(estudante1);

        Estudante estudante2 = new Estudante();
        estudante2.nome = "seila";
        estudante2.idade = 15;
        estudante2.sexo = 'f';
        impressora.imprima(estudante2);

        impressora.imprima(estudante1);//vai imprimir o nome josé, pois no final do metodo imprima ele alterou objeto para josé

        System.out.println(estudante1.nome); //prova de que o nome do estudante1 foi alterado para josé.
    }
}
