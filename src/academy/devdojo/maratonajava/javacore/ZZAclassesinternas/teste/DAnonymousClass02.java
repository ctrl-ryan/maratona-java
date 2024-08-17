
package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

import academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio.Falar;
import academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio.FalarIngles;
import academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio.FalarPortugues;

public class DAnonymousClass02 {
    public static void main(String[] args) {
    //Para o uso de uma interface, devemos criar uma classe que a implemente e sobrescreva seus métodos. E assim posso instânciar usando um objeto do tipo da Interface.

        Falar falarIngles = new FalarIngles();
        falarIngles.cumprimentar();
        falarIngles.despedir();

        Falar falarPortugues = new FalarPortugues();
        falarPortugues.cumprimentar();
        falarPortugues.despedir();

    //Porém, com classes anônimas também podemos criar uma instância de uma classe que implemente essa interface, e sobrescreva seus métodos diretamente. Essa classe nao possui um nome, você possui apenas uma instância dela.

        Falar falarFrances = new Falar() {
            @Override
            public void cumprimentar() {
                System.out.println("Salut, ça va ?");
            }
            @Override
            public void despedir() {
                System.out.println("Ça marche, mec !");
            }
        };
        falarFrances.cumprimentar();
        falarFrances.despedir();

        Falar falarEspanhol = new Falar() {
            @Override
            public void cumprimentar() {
                System.out.println("¡Hola, qué tal!");
            }

            @Override
            public void despedir() {
                System.out.println("¡Vale, amigo!");
            }
        };
        falarEspanhol.cumprimentar();
        falarEspanhol.despedir();


    }
}
