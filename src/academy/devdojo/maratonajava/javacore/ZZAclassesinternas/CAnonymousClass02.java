package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;


interface Cumprimento {
    void saudar();
}

abstract class Animal2{
    abstract void som();
}

public class CAnonymousClass02 {
    public static void main(String[] args) {

        //@ Posso usar classes anônimas com interfaces:

        Cumprimento cumprimento = new Cumprimento() {
            @Override
            public void saudar() {
                System.out.println("Olá!");
            }
        };
        cumprimento.saudar();


//==========================================================================================================================

        //@Posso usar classes anônimas com classes abstratas:

        Animal2 gatinho = new Animal2() {
            @Override
            void som() {
                System.out.println("meow!");
            }
        };
        gatinho.som();
//==========================================================================================================================
    }
}
