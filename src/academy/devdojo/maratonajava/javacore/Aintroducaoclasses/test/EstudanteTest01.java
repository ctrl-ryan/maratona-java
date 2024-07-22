package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {


        Estudante estudante1 = new Estudante();

        estudante1.nome = "Ryan";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
        System.out.println(estudante1);

        Estudante estudante2 = new Estudante();

        estudante2.nome = "jao";
        estudante2.idade = 22;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2);


    }
}
