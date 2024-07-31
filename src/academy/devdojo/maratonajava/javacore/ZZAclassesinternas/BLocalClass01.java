package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class BLocalClass01 {
    private String name = "Ryan";

    void print(){
        final String lastName = "Rodrigues";//<- precisa ser final, ou efetivamente final (não alterar após a inicialização).
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();//preciso iniciar a classe dentro do método print(), e já imediatamente chamar o método printLocal().
    }

    public static void main(String... args) {
        new BLocalClass01().print();
    }
}
