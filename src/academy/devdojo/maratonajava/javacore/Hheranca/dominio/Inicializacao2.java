package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Inicializacao2 extends Inicializacao {
    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇAO ESTATICO 2");
    }

    {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇAO COMUM 2");

    }

    public Inicializacao2(){
        System.out.println("DENTRO DO CONSTRUTOR 2");
    }
}
