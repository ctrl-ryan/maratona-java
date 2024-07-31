package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Animal {
    public void walk() {
        System.out.println("animal walking...");
    }
}

public class CAnonymousClass01 {
    public static void main(String[] args) {

        //@ Aqui estou usando uma instância comum de "Animal".

        Animal animal = new Animal();
        animal.walk();//Saída -> "animal walking..."

        //@ Aqui é como se eu tivesse criando uma subclasse de "Animal", e sobrescrevendo o método walk:

        Animal animalSubClass = new Animal() {
            @Override
            public void walk() {
                System.out.println("walking on the grass...");
            }
        };
        animalSubClass.walk();//Saída -> "walking on the grass..."

//*=========================================================================================================================

    //@Esse comportamento é o mesmo que ocorre com o ActionListener ao trabalhar com Swing em java.

        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("oi");
            }
        });

        //Aqui, a classe anônima é usada para implementar a interface ActionListener diretamente dentro do método addActionListener.
//*=========================================================================================================================

    }
}
