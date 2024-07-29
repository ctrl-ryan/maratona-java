package academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste;

public abstract class Animal {
    String name;

    void makeNoise(){
        System.out.println("some noise");
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
