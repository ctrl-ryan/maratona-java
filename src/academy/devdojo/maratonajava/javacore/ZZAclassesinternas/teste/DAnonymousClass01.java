package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

import academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio.Animal;

public class DAnonymousClass01 {
    public static void main(String[] args) {

    //Se quisermos usar uma classe da maneira que ela é, podemos simplesmente instância-lá e usar seus métodos:


        Animal animal = new Animal();
        animal.walk();
        animal.run();

    //Porém, se quisermos usar essa mesma classe só que com uma implementação diferente em seus métodos, teríamos que criar uma classe "filha" de Animal, com uma implementação diferente. Mas, podemos usar classes anonimas para instanciar uma sub-classe de Animal com seus métodos sobrescritos. Assim, criamos uma instância de uma classe que é "filha" de animal, porém essa classe não possui nome, você apenas possui um objeto dela.

        Animal dog = new Animal() {
            @Override
            public void walk() {
                System.out.println("Dog is walking");
            }

            @Override
            public void run() {
                System.out.println("Dog is running");
            }
        };
        dog.run();
        dog.walk();

    }
}
