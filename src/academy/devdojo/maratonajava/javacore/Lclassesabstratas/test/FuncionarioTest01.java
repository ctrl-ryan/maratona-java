package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Astrogildo",5000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Astrogildo",12000);

        System.out.println(gerente1);
        gerente1.calcularBonus();
        System.out.println(gerente1);

        System.out.println(desenvolvedor1);
        desenvolvedor1.calcularBonus();
        System.out.println(desenvolvedor1);
    }
}
