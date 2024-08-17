package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.dominio;

public class FalarIngles implements Falar{
    @Override
    public void cumprimentar() {
        System.out.println("Yo, what's up bro!");
    }

    @Override
    public void despedir() {
        System.out.println("See ya, man!");
    }
}
