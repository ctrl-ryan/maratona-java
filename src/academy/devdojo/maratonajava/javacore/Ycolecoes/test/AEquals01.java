package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class AEquals01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Samsung");
        Smartphone s2 = new Smartphone("1ABC1", "Samsung");

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
