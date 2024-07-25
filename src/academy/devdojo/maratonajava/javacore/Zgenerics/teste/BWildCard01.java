package academy.devdojo.maratonajava.javacore.Zgenerics.teste;



abstract class Animal {
    public abstract void consulta();
}

 class Cachorro extends Animal{
     @Override
     public void consulta() {
         System.out.println("Consultando o cachorro.");
     }
 }

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando o gatinho.");
    }
}

//=====================================================================================

public class BWildCard01 {
    public static void main(String[] args) {
        Cachorro[ ] cachorros = new Cachorro[]{new Cachorro()};
        Gato[ ] gatos = new Gato[]{new Gato()};

        printConsulta(cachorros);
    }

    public static void printConsulta(Object[] animals) {

    }
}

