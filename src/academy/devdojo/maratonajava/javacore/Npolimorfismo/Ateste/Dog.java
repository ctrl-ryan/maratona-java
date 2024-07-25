package academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste;

public class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("auau");
    }
    void growl(){
        System.out.println("grrrrr!");
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + name + '\'' +
               '}';
    }
}
