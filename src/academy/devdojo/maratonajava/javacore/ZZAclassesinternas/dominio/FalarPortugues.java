package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio;

public class FalarPortugues implements Falar{
    @Override
    public void cumprimentar() {
        System.out.println("Iai mano!");
    }

    @Override
    public void despedir() {
        System.out.println("Falou, cara!");
    }
}
