package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Ryan";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "seila";
        estudante2.idade = 15;
        estudante2.sexo = 'f';

        estudante1.imprima();
        estudante2.imprima();


    }
}
