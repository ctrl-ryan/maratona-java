package academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeNoise() {
        System.out.println("miau");
    }
}
