package academy.devdojo.maratonajava.revisao.lamdascomparametros;

public class PrintableImplementation implements Printable {

    @Override
    //o nome original do parâmetro anotherName é, na verdade, "suffix" e nao "anotherName".
    public void print(String anotherName) {
        System.out.println("meow" + anotherName);
    }
}
