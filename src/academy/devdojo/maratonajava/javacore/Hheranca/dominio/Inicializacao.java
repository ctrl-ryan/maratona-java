package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Inicializacao {
    protected String nome;

    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇAO ESTATICO 1");
    }

    {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇAO COMUM 1");

    }

    public Inicializacao(){
        System.out.println("DENTRO DO CONSTRUTOR 1");
    }
}
