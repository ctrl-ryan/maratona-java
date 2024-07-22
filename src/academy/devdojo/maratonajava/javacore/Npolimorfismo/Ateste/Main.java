package academy.devdojo.maratonajava.javacore.Npolimorfismo.Ateste;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = (Animal) new Dog();



        boolean sla = myAnimal instanceof Dog;
        System.out.println(sla);
    }
    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        Dog myDog = (Dog)animal;
        System.out.println(((Dog)animal));
        System.out.println(myDog);
    }
}
