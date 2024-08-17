package academy.devdojo.maratonajava.revisao.lambdas;

public class Cat implements Printable{
    String name;

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               '}';
    }


    @Override
    public void print() {
        System.out.println("meow");
    }
}
