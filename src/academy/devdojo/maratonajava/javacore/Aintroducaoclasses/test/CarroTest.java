package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;


public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Corsa Bala";
        carro01.modelo = "Compacto";
        carro01.ano = 1994;

        carro02.nome = "Ferrari";
        carro02.modelo = "296 GTB";
        carro02.ano = 2023;

        System.out.println("-----------------------------");

        System.out.println("Carro 1");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("-----------------------------");

        System.out.println("Carro 2");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);

        System.out.println("-----------------------------");

        //carro02 = carro02;
    }
}
